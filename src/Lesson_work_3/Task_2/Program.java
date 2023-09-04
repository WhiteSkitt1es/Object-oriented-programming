package Lesson_work_3.Task_2;

import java.util.Arrays;
import java.util.Random;

public class Program {

    private static Random random = new Random();

    public static Employee generateEmployee(){
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };

        int salaryIndex = random.nextInt(500, 900);
        int experienceWorkIndex = random.nextInt(1,20);
        int draw = random.nextInt(0,2);

        if (draw == 0){
            return
                    new Freelancer(surnames[random.nextInt(surnames.length)], names[random.nextInt(names.length)], salaryIndex*100,experienceWorkIndex);
        } else {
            return
                    new Worker(surnames[random.nextInt(surnames.length)], names[random.nextInt(names.length)], salaryIndex * 100,experienceWorkIndex);
        }
    }

    public static Employee[] generateEmployees(int counter){
        Employee[] workers = new Employee[counter];
        for (int i = 0; i < workers.length; i++){
            workers[i] = generateEmployee();
        }
        return workers;
    }

    public static void main(String[] args) {

        Employee[] workers = generateEmployees(12);

        for (Employee worker: workers) {
            System.out.println(worker);
        }


        Arrays.sort(workers);

        System.out.println();

        for (Employee worker: workers) {
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
