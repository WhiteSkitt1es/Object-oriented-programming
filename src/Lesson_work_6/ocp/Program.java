package Lesson_work_6.ocp;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        // Вариант 1
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new RightTriangle(3, 2));
        shapes.add(new Circle(4));
        shapes.add(new Square(5));
        double sumArea = 0;
        for (Shape shape : shapes){
            if (shape instanceof RightTriangle) {
                RightTriangle triangle = (RightTriangle) shape;
                sumArea += triangle.getKatet1() * triangle.getKatet2() / 2.0;
            }
            if (shape instanceof Square) {
                Square square = (Square) shape;
                sumArea += Math.pow(square.getSide(), 2);
            }

            if (shape instanceof Circle){
                Circle circle = (Circle) shape;
                sumArea += Math.PI * circle.getRadius() * circle.getRadius();
            }
        }
        System.out.printf("Сумма площадей фигур равна %.2f\n", sumArea);

        // Вариант 2
        List<ShapeV2> shapes2 = new ArrayList<>();
        shapes2.add(new RightTriangleV2(3, 2));
        shapes2.add(new CircleV2(4));
        shapes2.add(new SquareV2(5));
        sumArea = 0;
        for (ShapeV2 shapeV2 : shapes2){
            sumArea += shapeV2.getArea();
        }
        System.out.printf("Сумма площадей фигур равна %.2f\n", sumArea);


    }

}
