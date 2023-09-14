package Lesson_work_6.lsp;

public class Penguin extends Bird {

    public Penguin() {
        super(false,0);
    }

    @Override
    public void fly() {
        //System.out.println("Пингвин не умеет летать!");
        throw new RuntimeException("Пингвин не умеет летать!");
    }
}
