package Lesson_work_2.sample2;

public class Dog extends BaseDog implements Animal {

    @Override
    public void jump() {
        System.out.println("Собака прыгает.");
    }

    public void voice() {
        System.out.println("Собака лает.");
    }

}

abstract class BaseDog {

}