
public class Client {
    public static void main(String[] args) {
        System.out.printf("%s　%s　\n",c.BLUE_BG,c.BLACK_BG);

    }


    public static final int black = 30, red = 31, green = 32, YELLOW = 33, BLUE = 34, MAGENTA = 35, CYAN = 36, WHITE = 37;
    public static final int bold = 1, dim = 2, italic = 3, underline = 4, blinking = 5, reverse = 7, hidden = 8, strikethrough = 9;
    public static String c(int base, boolean bg, boolean bright) {
        if (bg)
            base += 10;
        if (bright)
            base += 60;
        
        return ("\033[%d");
    }
    
}/*
ESC[38;2;{r};{g};{b}m	Set foreground color as RGB.
ESC[48;2;{r};{g};{b}m	Set background color as RGB.

ESC[38;5;{ID}m	Set foreground color.
ESC[48;5;{ID}m	Set background color.

Original 16 colors  = 0-15
Proceeding 216 colors  = 16-231 or formed by a 3bpc RGB value offset by 16, packed into a single value
Final 24 colors  = 232-255 are grayscale starting from a shade slighly lighter than black, ranging up to shade slightly darker than white.
*/
