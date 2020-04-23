package innerclasses;

public class Display {

    private static final int DISPLAY_HEIGHT = 1920;
    private static final int DISPLAY_WIDTH = 1280;
    private int x = 0;

    public Display() {
        Pixel pixel = new Pixel(10, 10, Color.GREEN);
    }

    private class Pixel {
        private int x;
        private int y;
        private Color color;

        private Pixel(int x, int y, Color color) {

            if (x >= 0 && x <= DISPLAY_WIDTH && y >= 0 && y <= DISPLAY_HEIGHT) {
                this.x = x;
                this.y = y;
                this.color = color;
                System.out.println("Creating " + color + " pixel at (" + x + "," + y + ")");
            } else {
                throw new IllegalArgumentException("Coordinats should me between 0 and " + DISPLAY_HEIGHT + " and 0 and " + DISPLAY_WIDTH);
            }
        }


    }


    public enum Color {
        RED, GREEN, BLUE, CYAN, MAGENTA, YELLOW, BLACK
    }


}
