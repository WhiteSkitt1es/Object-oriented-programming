package Lesson_work_6.srp1;

public class SquareDrawer {


    public void draw(){
        for (int i = 0; i < square.getSide() * 2 * scale; i++){
            System.out.print("*");
        }
        System.out.println();
        for (int i = 0; i < square.getSide() * scale - 2 ; i++){
            System.out.print("*");
            for (int j = 1; j < square.getSide() * 2 * scale - 1; j++){
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for (int i = 0; i < square.getSide() *scale * 2; i++){
            System.out.print("*");
        }
        System.out.println();
    }

    public SquareDrawer(SquareV2 square, int scale) {
        this.square = square;
        this.scale = scale;
    }

    public SquareDrawer(SquareV2 square) {
        this.square = square;
    }

    public SquareV2 getSquare() {
        return square;
    }

    public int getScale() {
        return scale;
    }

    private SquareV2 square;
    private int scale = 1;

}
