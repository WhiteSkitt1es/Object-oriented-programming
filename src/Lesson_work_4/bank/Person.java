package Lesson_work_4.bank;

public class Person implements PersonalData{

    private final String fio;
    private final String inn;

    @Override
    public String getInn() {
        return inn;
    }

    public String getFio() {
        return fio;
    }

    public Person(String fio, String inn) {
        this.fio = fio;
        this.inn = inn;
    }

    @Override
    public String toString() {
        return String.format("%s; %s", inn, fio);
    }
}
