package Lesson_work_6.srp2;

public class Program {
    public static void main(String[] args) {

        Order order = new Order();
        ConsoleReader consoleReader = new ConsoleReader(order);
        consoleReader.inputFromConsole();
        JsonFormat jsonFormat = new JsonFormat(order);
        jsonFormat.saveToJson();
    }
}
