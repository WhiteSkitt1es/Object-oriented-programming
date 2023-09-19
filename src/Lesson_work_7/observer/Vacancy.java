package Lesson_work_7.observer;

public class Vacancy {
    private String name;
    private int salary;

    public Vacancy(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
