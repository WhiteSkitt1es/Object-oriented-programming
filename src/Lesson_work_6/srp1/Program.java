package Lesson_work_6.srp1;

public class Program {

    public static void main(String[] args) {
        Square square = new Square(new Point(1, 1), 5);
        System.out.printf("Площадь квадрата: %d\n", square.getArea());
        square.draw();

        SquareV2 squareV2 = new SquareV2(new Point(1, 1), 5);
        System.out.printf("Площадь квадрата: %d\n", squareV2.getArea());
        SquareDrawer squareDrawer = new SquareDrawer(squareV2, 3);
        squareDrawer.draw();
    }
}
