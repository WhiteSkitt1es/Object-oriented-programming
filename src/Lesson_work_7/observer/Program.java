package Lesson_work_7.observer;

public class Program {

    /**
     * TODO: Доработать приложение, которое разрабатывалось на семинаре, поработать с шаблоном проектирования Observer.
     *  Добавить новую сущность "Вакансия", компания должна рассылать вакансии.
     *  Только после этого вы можете усложнить ваше приложение (при желании),
     *  например, добавить тип вакансии (enum), учитывать тип вакансии при отправке предложения соискателю.
     * @param args
     */
    public static void main(String[] args) {
        Publisher jobAgency = new JobAgency();

        Vacancy vacancy1 = new Vacancy("Разработчик",70000);
        Vacancy vacancy2 = new Vacancy("Менеджер",50000);
        Vacancy vacancy3 = new Vacancy("Дизайнер",60000);

        Company google = new Company("Google",  jobAgency, vacancy1);
        Company yandex = new Company("Yandex",  jobAgency, vacancy2);
        Company geekBrains = new Company("GeekBrains",  jobAgency, vacancy3);

        Student student1 = new Student("Артем","Разработчик");
        Worker worker1 = new Worker("Сергей","Менеджер");
        Freelancer freelancer1 = new Freelancer("Николай","Дизайнер");

        jobAgency.registerObserver(student1);
        jobAgency.registerObserver(worker1);
        jobAgency.registerObserver(freelancer1);

        for (int i = 0; i < 4; i++) {
            google.needEmployee();
            yandex.needEmployee();
            geekBrains.needEmployee();
        }
    }
}
