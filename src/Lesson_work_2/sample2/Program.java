package Lesson_work_2.sample2;

public class Program {

    public static void main(String[] args) {

        Cat cat1 = new Cat();
        Dog dog1 = new Dog();

        Animal[] animals = new Animal[2];
        animals[0] = cat1;
        animals[1] = dog1;

        processVoice(animals);

    }

    public static void processVoice(Animal[] animals) {
        for (Animal animal : animals) {
            animal.voice();
            animal.jump();

        }
    }

}
