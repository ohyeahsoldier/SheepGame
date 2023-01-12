package Package;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
        
    public static Tile[][] World = new Tile[][] {
        {Tile.random(),Tile.random(),Tile.random(),Tile.random(),Tile.random(),Tile.random()},
        {Tile.random(),Tile.random(),Tile.random(),Tile.random(),Tile.random(),Tile.random()},
        {Tile.random(),Tile.random(),Tile.random(),Tile.random(),Tile.random(),Tile.random()},
        {Tile.random(),Tile.random(),Tile.random(),Tile.random(),Tile.random(),Tile.random()},
    }; //World is an array of arrays; World[0] & World[1] are arrays of Tiles
    public static Scanner input = new Scanner(System.in);
    public static ArrayList<Sheep> SheepList = new ArrayList<Sheep>();
    public static void main(String[] args) {
        System.out.println(World.length +" by "+ World[0].length);

        //In the future I should be able to support more than just Sheep
        SheepList.add(new Sheep(2,1));
        SheepList.add(new Sheep(0,0));
        printWorld();
        String INPUT = input.next();

        while (!INPUT.equals("c") && SheepList.size()>d=0) {
            moveSheep(SheepList.get(0),INPUT);
            printWorld();
            INPUT = input.next();
        }
        System.out.println(c.RED_BG_BRIGHT+bold+"End"+reset);
        input.close();
    }
    public static void printWorld() {
        //PLEASE how do I make this *not* nest 10 layers deep
        //
        for (int y=0; y<World.length; y++) {
            for (int x=0; x<World[0].length; x++) {
                String rendered = "　";
                for (Sheep shep : SheepList) {
                    if (shep.getX()==x && shep.getY()==y) {
                        switch (World[y][x]) { 
                            case LAVA:
                                SheepList.remove(shep); //shep = null;
                                rendered = "💥";
                                break; //Eventually garbage collector will get em... maybe
                            default: rendered = "🐑";
                        }
                    }
                }
                System.out.print(World[y][x]+rendered+reset);
            }
            System.out.println();
        }
        System.out.print("\n");
    }
    public static void moveSheep(Sheep mySheep,String INPUT) {
        switch (INPUT) {
            case "w":
                mySheep.moveUp(1);
                break;
            case "a":
                mySheep.moveRight(-1);
                break;
            case "s":
                mySheep.moveUp(-1);
                break;
            case "d":
                mySheep.moveRight(1);
                break;
        }
    }
}/*
ESC[38;2;{r};{g};{b}m	Set foreground color as RGB.
ESC[48;2;{r};{g};{b}m	Set background color as RGB.

//256 color
    ESC[38;5;{ID}m	Set foreground color.
    ESC[48;5;{ID}m	Set background color.
Original 16 colors  = 0-15
Proceeding 216 colors  = 16-231 or formed by a 3bpc RGB value offset by 16, packed into a single value
Final 24 colors  = 232-255 are grayscale starting from a shade slighly lighter than black, ranging up to shade slightly darker than white.
*/
