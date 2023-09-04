package Lesson_work_3.Task_2;

import java.util.Arrays;
import java.util.Random;

public class Program {

    private static Random random = new Random();


    /**
     * TODO: Переработать метод generateEmployee, метод должен генерировать
     *   случайного сотрудника типа Worker или Freelancer
     * @return
     */
    public static Worker generateEmployee(){
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };

        int salaryIndex = random.nextInt(500, 900);

        return
                new Worker(surnames[random.nextInt(surnames.length)], names[random.nextInt(names.length)], salaryIndex*100);
    }

    public static Worker[] generateEmployees(int counter){
        Worker[] workers = new Worker[counter];
        for (int i = 0; i < workers.length; i++){
            workers[i] = generateEmployee();
        }
        return workers;
    }

    public static void main(String[] args) {

        Worker[] workers = generateEmployees(12);

        for (Worker worker: workers) {
            System.out.println(worker);
        }


        Arrays.sort(workers);

        System.out.println();

        for (Worker worker: workers) {
            System.out.println(worker);
        }

        /*String str = "рабочий";
        int i = 12;
        boolean f = true;
        System.out.println(str);
        System.out.println(i);
        System.out.println(f );*/

    }
}
