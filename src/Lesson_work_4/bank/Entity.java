package Lesson_work_4.bank;

public class Entity implements PersonalData{

    private final String name;
    private final String inn;

    @Override
    public String getInn() {
        return inn;
    }

    public String getName() {
        return name;
    }

    public Entity(String name, String inn) {
        this.name = name;
        this.inn = inn;
    }

    @Override
    public String toString() {
        return String.format("%s; %s", inn, name);
    }
}
