package Lesson_work_2.sample3;

public class Human extends BaseHuman implements Runner {

    private final String name;
    private final int maxRun;
    private final int maxJump;

    public Human(String name, int maxRun, int maxJump) {
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

    @Override
    public boolean jump(int height) {
        if (height <= maxJump) {
            System.out.printf("%s перепрыгнул через стену %d см.\n", name, height);
            return true;
        } else {
            System.out.printf("%s не смог перепрыгнуть через стену %d см.\n", name, height);
            return false;
        }
    }

    @Override
    public boolean run(int length) {
        if (length <= maxRun) {
            System.out.printf("%s пробежал по беговой дорожке %d м.\n", name, length);
            return true;
        } else {
            System.out.printf("%s не смог пробежать по беговой дорожке %d м.\n", name, length);
            return false;
        }
    }

}

abstract class BaseHuman {

}