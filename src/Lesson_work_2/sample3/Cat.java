package Lesson_work_2.sample3;

public class Cat extends BaseCat implements Runner {

    private final String name;
    private final int maxRun;
    private final int maxJump;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getMaxRun() {
        return maxRun;
    }

    @Override
    public int getMaxJump() {
        return maxJump;
    }

    public Cat(String name, int maxRun, int maxJump) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }
}

abstract class BaseCat {

}
