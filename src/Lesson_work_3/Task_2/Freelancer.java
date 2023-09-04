package Lesson_work_3.Task_2;

/**
 * Фрилансер (работник с почасовой оплатой)
 */
public class Freelancer extends Employee {
    public Freelancer(String surName, String name, double salary, int experienceWork) {
        super(surName, name, salary, experienceWork);
    }
    @Override
    public double calculateSalary() {
        return salary * 0.8;
    }
    @Override
    public String toString() {
        return String.format("%s %s; Фрилансер со стажем %d лет; Среднемесячная заработная плата (почасовая): %.2f",
                surName, name, experienceWork, calculateSalary());
    }
}
