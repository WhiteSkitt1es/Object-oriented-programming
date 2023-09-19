package Lesson_work_7.adapter;

public class Program {

    public static void main(String[] args) {

        MeteoStore meteoStore = new MeteoStore();

        MS200 ms200 = new MS200(1123434);

        meteoStore.save(ms200);

        ST500 st500 = new ST500(5556);

        meteoStore.save(new AdapterST500(st500));

    }

}
