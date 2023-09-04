package Lesson_work_3.Task_1;

public class Program {

    /*
    *   Создать классы Собака и Кот с наследованием от класса Животное.
        Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия.
        Результатом выполнения действия будет печать в консоль. (Например, dog1.run(150); -> 'Бобик пробежал 150 м.');
        У каждого животного есть ограничения на действия
        (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
        Добавить подсчет созданных котов, собак и животных.
    * */

    public static void main(String[] args) {

        Animal[] aminals = {
                new Cat("Барсик"),
                new Cat("Персик"),
                new Dog("Быстрый", 500, 50),
                new Dog("Тузик", 1500, 350),
                new Dog("Шарик", 300, 150),
                new Dog("Бима", 200, 250),
        };

        for (Animal animal : aminals){
            System.out.printf("%d - %s\n", animal.getId(), animal.getName());
            animal.swim(200);
            animal.run(600);
        }

        System.out.println("Статический счетчик идентификаторов животных: " + Animal.getIdCounter());

        System.out.println("Было создано " + Cat.getCounter() + " котов.");
        System.out.println("Было создано " + Dog.getCounter() + " собак.");
        System.out.println("Было создано " + Animal.getCounter() + " животных.");

    }

}
