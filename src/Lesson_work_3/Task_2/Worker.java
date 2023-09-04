package Lesson_work_3.Task_2;

public class Worker extends Employee {

    public Worker(String surName, String name, double salary, int experienceWork) {
        super(surName, name, salary, experienceWork);
    }
    @Override
    public double calculateSalary() {
        return salary;
    }
    @Override
    public String toString() {
        return String.format("%s %s; Рабочий со стажем %d лет; Среднемесячная заработная плата (фиксированная): %.2f",
                surName, name, experienceWork, calculateSalary());
    }
}
