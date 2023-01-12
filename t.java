public enum t {
    // Regular Colors. Normal color, no bold, BG color etc.
    BLACK(30),    // BLACK
    RED(31),      // RED
    GREEN(32),    // GREEN
    YELLOW(33),   // YELLOW
    BLUE(34),     // BLUE
    MAGENTA(35),  // MAGENTA
    CYAN(36),     // CYAN
    WHITE(37);    // WHITE

    private final int code;
    t(int code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return ""+code;
    }
}
