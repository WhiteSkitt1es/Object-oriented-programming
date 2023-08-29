package Lesson_work_2.sample3;

public class Robot extends BaseRobot implements Runner {

    private final String name;
    private final int maxRun;
    private final int maxJump;

    public Robot(String name, int maxRun, int maxJump) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getMaxJump() {
        return maxJump;
    }

    @Override
    public int getMaxRun() {
        return maxRun;
    }

}

abstract class BaseRobot {

}
