package Package;
import java.util.Random;

public enum Tile {
    AIR(0,c.WHITE_BG),
    WATER(1,c.BLUE_BG),
    GRASS(2,c.GREEN_BG),
    STONE(3,c.BLACK_BG),
    LAVA(4,c.RED_BG)
    ;

    private final int id;
    private final c color;
    Tile(int id, c color) {
        this.id = id;
        this.color = color;
    }

    @Override
    public String toString() {
        return ""+color;
    }
    public int toInt() {
        return id;
    }

    //Because I don't want to create a new Tile[] and Random every time I call randomTile()
    private static final Tile[] TileArray = Tile.values();
    private static final Random rng = new Random();

    public static Tile random() {
        return TileArray[rng.nextInt(TileArray.length)];
    }
}
