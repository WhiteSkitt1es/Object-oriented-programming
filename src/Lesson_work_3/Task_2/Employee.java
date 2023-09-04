package Lesson_work_3.Task_2;

/**
 * Сотрудник
 */
public abstract class Employee implements Comparable<Employee> {


    /**
     * Фамилия
     */
    protected String surName;

    /**
     * Имя
     */
    protected String name;

    /**
     * Ставка заработной платы
     */
    protected double salary;

    /**
     * Стаж работы
     */
    protected int experienceWork;

    public abstract double calculateSalary();

    public Employee(String surName, String name, double salary, int experienceWork) {
        this.surName = surName;
        this.name = name;
        this.salary = salary;
        this.experienceWork = experienceWork;
    }

    @Override
    public String toString() {
        return String.format("%s %s", surName, name);
    }

    @Override
    public int compareTo(Employee o) {
        int res = Integer.compare(experienceWork,o.experienceWork);
        if(res == 0) {
            return Double.compare(calculateSalary(),o.calculateSalary());
        }
        return res;
//        Сортировка по имени и фамилии
//        int res = surName.compareTo(o.surName);
//        if (res == 0){
//            return name.compareTo(o.name);
//        }
//        return res;
    }
}
