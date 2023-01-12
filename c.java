public enum c {
    //Color end string, color reset
    RESET("\033[0m"),

    // Regular Colors. Normal color, no bold, BG color etc.
    BLACK("\033[0;30m"),    // BLACK
    RED("\033[0;31m"),      // RED
    GREEN("\033[0;32m"),    // GREEN
    YELLOW("\033[0;33m"),   // YELLOW
    BLUE("\033[0;34m"),     // BLUE
    MAGENTA("\033[0;35m"),  // MAGENTA
    CYAN("\033[0;36m"),     // CYAN
    WHITE("\033[0;37m"),    // WHITE

    // Bold
    BLACK_BOLD("\033[1;30m"),   // BLACK
    RED_BOLD("\033[1;31m"),     // RED
    GREEN_BOLD("\033[1;32m"),   // GREEN
    YELLOW_BOLD("\033[1;33m"),  // YELLOW
    BLUE_BOLD("\033[1;34m"),    // BLUE
    MAGENTA_BOLD("\033[1;35m"), // MAGENTA
    CYAN_BOLD("\033[1;36m"),    // CYAN
    WHITE_BOLD("\033[1;37m"),   // WHITE

    // Dim
    BLACK_DIM("\033[1;30m"),   // BLACK
    RED_DIM("\033[1;31m"),     // RED
    GREEN_DIM("\033[1;32m"),   // GREEN
    YELLOW_DIM("\033[1;33m"),  // YELLOW
    BLUE_DIM("\033[1;34m"),    // BLUE
    MAGENTA_DIM("\033[1;35m"), // MAGENTA
    CYAN_DIM("\033[1;36m"),    // CYAN
    WHITE_DIM("\033[1;37m"),   // WHITE

    // Underline
    BLACK_UNDERLINED("\033[4;30m"),     // BLACK
    RED_UNDERLINED("\033[4;31m"),       // RED
    GREEN_UNDERLINED("\033[4;32m"),     // GREEN
    YELLOW_UNDERLINED("\033[4;33m"),    // YELLOW
    BLUE_UNDERLINED("\033[4;34m"),      // BLUE
    MAGENTA_UNDERLINED("\033[4;35m"),   // MAGENTA
    CYAN_UNDERLINED("\033[4;36m"),      // CYAN
    WHITE_UNDERLINED("\033[4;37m"),     // WHITE

    // BG
    BLACK_BG("\033[40m"),   // BLACK
    RED_BG("\033[41m"),     // RED
    GREEN_BG("\033[42m"),   // GREEN
    YELLOW_BG("\033[43m"),  // YELLOW
    BLUE_BG("\033[44m"),    // BLUE
    MAGENTA_BG("\033[45m"), // MAGENTA
    CYAN_BG("\033[46m"),    // CYAN
    WHITE_BG("\033[47m"),   // WHITE

    // High Intensity
    BLACK_BRIGHT("\033[0;90m"),     // BLACK
    RED_BRIGHT("\033[0;91m"),       // RED
    GREEN_BRIGHT("\033[0;92m"),     // GREEN
    YELLOW_BRIGHT("\033[0;93m"),    // YELLOW
    BLUE_BRIGHT("\033[0;94m"),      // BLUE
    MAGENTA_BRIGHT("\033[0;95m"),   // MAGENTA
    CYAN_BRIGHT("\033[0;96m"),      // CYAN
    WHITE_BRIGHT("\033[0;97m"),     // WHITE

    // High Intensity BGs
    BLACK_BG_BRIGHT("\033[0;100m"),     // BLACK
    RED_BG_BRIGHT("\033[0;101m"),       // RED
    GREEN_BG_BRIGHT("\033[0;102m"),     // GREEN
    YELLOW_BG_BRIGHT("\033[0;103m"),    // YELLOW
    BLUE_BG_BRIGHT("\033[0;104m"),      // BLUE
    MAGENTA_BG_BRIGHT("\033[0;105m"),   // MAGENTA
    CYAN_BG_BRIGHT("\033[0;106m"),      // CYAN
    WHITE_BG_BRIGHT("\033[0;107m");     // WHITE

    private final String code;
    c(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return code;
    }
}