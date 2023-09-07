package Lesson_work_4;

import java.util.ArrayList;
import java.util.Arrays;

public class Program {

    public static void main(String[] args) {
        ArrayList arrayList1 = new ArrayList();
        arrayList1.add(12);

        MyArrayList<Employee> myArrayList = new MyArrayList<>(new Employee[100]);
        myArrayList.add(new Employee("AAA", 22));
        //myArrayList.add(-1);
        //myArrayList.add("Hello");
        //myArrayList.add(false);

        System.out.println("Кол-во элементов коллекции: " + myArrayList.getSize());

        for(Employee e : myArrayList)
        {
            /*if (e instanceof Employee){
                Employee employee = (Employee)e;
                System.out.println("Возраст сотрудника: " + employee.getAge());
            }*/


            if (e != null){

                System.out.println(e);
                System.out.println("Возраст сотрудника: " + e.getAge());
            }
        }

        Integer[] array1 = new Integer[] {3, 4, 1, 5, 9 ,6, 1};
        String[] array2 = new String[] {"AA", "BB", "CC", "DD"};

        System.out.println(Arrays.toString(array2));
        String[] arrayOut =  ArrayUtils.replaceTwoElements(array2, 2, 3);

        System.out.println(Arrays.toString(arrayOut));


    }

}
