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

    public abstract double calculateSalary();


    public Employee(String surName, String name, double salary) {
        this.surName = surName;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s", surName, name);
    }

    @Override
    public int compareTo(Employee o) {
        int res = surName.compareTo(o.surName);
        if (res == 0){
            return name.compareTo(o.name);
        }
        return res;
    }
}
