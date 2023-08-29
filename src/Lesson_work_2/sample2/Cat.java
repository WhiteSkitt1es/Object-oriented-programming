package Lesson_work_2.sample2;

public class Cat extends BaseCat implements Animal {

    @Override
    public void jump() {
        System.out.println("Кот прыгает.");
    }

    public void voice() {
        System.out.println("Кот мяукает.");
    }

}

abstract class BaseCat {

}