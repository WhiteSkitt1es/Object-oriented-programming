package Lesson_work_2.sample1;

public abstract class Animal {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public abstract void voice();

    public void jump() {
        System.out.println("Животное подпрыгнуло.");
    }

}

class Cat extends Animal {

    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void voice() {
        System.out.println("Кот мяукает.");
    }
}

class Dog extends Animal {

    @Override
    public void voice() {
        System.out.println("Собака лает.");
    }
}