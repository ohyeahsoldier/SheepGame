package Package;

public class App {
    public static final String reset = "\033[0m";
    public static final String bold = "\033[1m", dim = "\033[2m", italic = "\033[3m", underline = "\033[4m", reverse = "\033[7m", hidden = "\033[8m", strikethrough = "\033[9m";
    //doesnt work //blinking = "\033[5m", 
    public static void main(String[] args) {
        c test = c.BLACK_BG_BRIGHT;
        switch (test) {
            case BLACK_BG_BRIGHT:
                System.out.println("switch case statements!");
                break;
            default:
                System.out.println("wtf happened");
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
