package Lesson_work_6.srp2;

import java.util.Scanner;

public class ConsoleReader {
    public void inputFromConsole(){
        order.setClientName(prompt("Client name: "));
        order.setProduct(prompt("Product: "));
        order.setQnt(Integer.parseInt(prompt("Quantity: ")));
        order.setPrice(Integer.parseInt(prompt("Price: ")));
    }
    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
    Order order;
    public ConsoleReader(Order order) {
        this.order = order;
    }
}
