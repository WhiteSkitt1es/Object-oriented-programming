package Lesson_work_4.homework;

import java.util.ArrayList;

public class Program {

    /**
     * a. Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
     * b. Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта,
     * поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
     * c. Для хранения фруктов внутри коробки можно использовать ArrayList;
     * d. Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
     * вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
     * e. Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую
     * подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае.
     * Можно сравнивать коробки с яблоками и апельсинами;
     * f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
     * Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
     * Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
     * g. Не забываем про метод добавления фрукта в коробку.
     *
     * Формат сдачи: ссылка на гитхаб проект
     * @param args
     */
    public static void main(String[] args) {

        Box<Apple> boxApple1 = new Box<>();
        for (int i = 0; i < 7; i++) {
            boxApple1.add(new Apple());
        }
        System.out.printf("Колличество яблок в данной корзине %d, а вес ее составляет %.1f\n", boxApple1.sizeBox(), boxApple1.getWeight());

        Box<Apple> boxApple2 = new Box<>();
        for (int i = 0; i < 8; i++) {
            boxApple2.add(new Apple());
        }
        System.out.printf("Колличество яблок в данной корзине %d, а вес ее составляет %.1f\n", boxApple2.sizeBox(), boxApple2.getWeight());

        Box<Orange> boxOrange1 = new Box<>();
        for (int i = 0; i < 4; i++) {
            boxOrange1.add(new Orange());
        }
        System.out.printf("Колличество апельсинов в данной корзине %d, а вес ее составляет %.1f\n", boxOrange1.sizeBox(), boxOrange1.getWeight());

        Box<Orange> boxOrange2 = new Box<>();
        for (int i = 0; i < 4; i++) {
            boxOrange2.add(new Orange());
        }
        System.out.printf("Колличество апельсинов в данной корзине %d, а вес ее составляет %.1f\n", boxOrange2.sizeBox(), boxOrange2.getWeight());

        System.out.println(boxApple1.compare(boxOrange1)); // Сравнили коробки

        boxApple2.replaceAll(boxApple1); // Пересыпали яблоки
//        boxApple1.sprinkle(boxOrange1); // Пересыпать апельсины в яблоки нельзя
        System.out.println(boxApple1.sizeBox());
        System.out.println(boxApple2.sizeBox());
    }

}
