package Lesson_work_7.factory;

import java.util.Random;

public class Program {

    static Random random = new Random();
    static Employee generateEmployee(EmployeeType employeeType){
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };
        int salary = random.nextInt(200, 500);
        int index = random.nextInt(100, 150);
        return switch (employeeType) {
            case Freelancer -> new Freelancer(names[random.nextInt(10)], surnames[random.nextInt(10)], salary);
            case Worker -> new Worker(names[random.nextInt(10)], surnames[random.nextInt(10)], salary * index);
        };
    }

    public static void main(String[] args) {
        Employee worker = generateEmployee(EmployeeType.Worker);
        Employee freelancer = generateEmployee(EmployeeType.Freelancer);
        System.out.println(worker.toString());
        System.out.println(freelancer.toString());
    }

}
