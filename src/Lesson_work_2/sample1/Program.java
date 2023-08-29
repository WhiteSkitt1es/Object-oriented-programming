package Lesson_work_2.sample1;

public class Program {

    public static void main(String[] args) {

        Cat cat1 = new Cat();
        cat1.setColor("Рыжий");

        Dog dog1 = new Dog();

        Animal[] animals = new Animal[2];
        animals[0] = cat1;
        animals[1] = dog1;

        processVoice(animals);

    }

    public static void processVoice(Animal[] animals) {
        for (Animal animal : animals) {

            animal.voice();
            if (animal instanceof Cat) {
                Cat cat = (Cat) animal;
                System.out.println(cat.getColor());
            }

        }
    }

}
