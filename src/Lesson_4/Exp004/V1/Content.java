package Lesson_4.Exp004.V1;

public abstract class Content {
    public String name;

    public Content(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
