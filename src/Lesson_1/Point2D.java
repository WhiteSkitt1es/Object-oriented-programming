package Lesson_1;

/**
 * Это точка в двоичной системе координат.
 */
public class Point2D {
    private int x, y;

    /**
     * Это конструктор.
     * 
     * @param valueX Это координата точки по X.
     * @param valueY Это координата точки по Y.
     */
    public Point2D(int valueX, int valueY) {
        x = valueX;
        y = valueY;
    }

    public Point2D() {
        this(0, 0);
    }

    public Point2D(int value) {
        this(value, value);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    private String getPoint() {
        return String.format("x: %d, y: %d", x, y);
    }

    @Override
    public String toString() {
        return getPoint();
    }

    static double distance(Point2D a, Point2D b) {
        return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
    }
}
