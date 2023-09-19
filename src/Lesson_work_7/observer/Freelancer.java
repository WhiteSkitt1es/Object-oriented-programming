package Lesson_work_7.observer;

public class Freelancer implements Observer{

    private String name;

    private String jobTitle;
    private int salary = 60000;

    public Freelancer(String name,String jobTitle) {
        this.name = name;
        this.jobTitle = jobTitle;
    }

    @Override
    public boolean receiveOffer(String companyName, String jobTitle, int salary) {
        if (this.salary <= salary && this.jobTitle.equals(jobTitle)){
            System.out.printf("Фрилансер: %s: Мне нужна эта работа! (Компания: %s; Вакансия: %s; Заработная плата: %d)\n",
                    name, companyName, jobTitle, salary);
            return true;
        }
        else{
            System.out.printf("Фрилансер: %s: Я найду работу получше! (Компания: %s; Вакансия: %s; Заработная плата: %d)\n",
                    name, companyName, jobTitle, salary);
            return false;
        }
    }
}
