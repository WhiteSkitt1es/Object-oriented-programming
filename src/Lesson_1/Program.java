package Lesson_1;

public class Program {
    public static void main(String[] args) {
        Point2D a = new Point2D(10, 8);
        System.out.println(a);
        Point2D b = new Point2D(6, 5);
        System.out.println(b);
        var res = Point2D.distance(a, b);
        System.out.println(res);
    }
}
