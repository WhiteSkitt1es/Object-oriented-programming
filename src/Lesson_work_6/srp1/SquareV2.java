package Lesson_work_6.srp1;

import java.util.ArrayList;
import java.util.List;

public class SquareV2 {

    //region Public Methods

    public int getArea(){
        return side * side;
    }

    //endregion

    //region Constructors
    public SquareV2(Point point1, int side) {
        this.side = side;

        Point point2 = new Point(point1.getX() + side, point1.getY());
        Point point3 = new Point(point1.getX() + side, point1.getY() + side);
        Point point4 = new Point(point1.getX(), point1.getY()+ side);

        points = new ArrayList<>();
        points.add(point1);
        points.add(point2);
        points.add(point3);
        points.add(point4);
    }

    //endregion

    //region Public Getters And Setters (Properties)

    public List<Point> getPoints() {
        return points;
    }

    public int getSide() {
        return side;
    }

    //endregion

    //region Private Fields
    private List<Point> points;

    private int side;

    //endregion

}
