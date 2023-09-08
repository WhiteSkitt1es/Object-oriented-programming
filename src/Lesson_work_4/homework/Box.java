package Lesson_work_4.homework;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;

public class Box<T extends Fruit>  {

    // Коллекция для хранения фруктов (3c)
    LinkedList<T> fruits;

    //#region Constructors

    public Box() {
        this.fruits = new LinkedList<>();
    }

    public Box(Collection<T> fruits) {
        this.fruits = new LinkedList<>(fruits);
    }

    public Box(T... fruits) {
        this.fruits = new LinkedList<>(Arrays.asList(fruits));
    }

    //#endregion

    /**
     * Получить вес всех фруктов, находящихся в коробке (3d)
     * @return - вес фруктов
     */
    public double getWeight() {
        if (fruits.isEmpty()) return 0;
        // Кол-во фруктов (кол-во элементов коллекции) * вес фрукта (можем взять с первого элемента)
        return fruits.size() * fruits.get(0).getWeight();
    }

    /**
     * Сравнить вес коробки, с коробкой, подаваемой на вход ввиде параметра (3e)
     * @param other - другая коробка
     * @return - результат сравнения веса коробок (погрешность 0.001)
     */
    public boolean compare(Box<?> other) {
        return Math.abs(getWeight() - other.getWeight()) < 0.001;
    }

    /**
     * Переместить все фрукты из другой коробки в текущую (3f)
     * @param other - другая коробка
     */
    public void replaceAll(Box<T> other) {
        other.getFruits().addAll(fruits);
        fruits.clear();
    }

    /**
     * Получить количество яблок в коробке
     * @return
     */
    public int sizeBox(){
        return fruits.size();
    }

    /**
     * Получить все фрукты в коробке (вспомогательный метод, 3f)
     * @return
     */
    public LinkedList<T> getFruits() {
        return fruits;
    }

    /**
     * Метод добавления фрукта в коробку (3g)
     * @param fruit - фрукт
     */
    public void add(T fruit) {
        fruits.add(fruit);
    }

}
