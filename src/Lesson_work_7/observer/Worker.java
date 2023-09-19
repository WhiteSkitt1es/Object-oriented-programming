package Lesson_work_7.observer;

public class Worker implements Observer {

    private String name;

    private String jobTitle;
    private int salary = 70000;

    public Worker(String name, String jobTitle) {
        this.name = name;
        this.jobTitle = jobTitle;
    }

    @Override
    public boolean receiveOffer(String companyName, String jobTitle, int salary) {
        if (this.salary <= salary && this.jobTitle.equals(jobTitle)){
            System.out.printf("Рабочий: %s: Мне нужна эта работа! (Компания: %s; Вакансия: %s; Заработная плата: %d)\n",
                    name, companyName, jobTitle, salary);
            return true;
        }
        else{
            System.out.printf("Рабочий: %s: Я найду работу получше! (Компания: %s; Вакансия: %s; Заработная плата: %d)\n",
                    name, companyName, jobTitle, salary);
            return false;
        }
    }
}
