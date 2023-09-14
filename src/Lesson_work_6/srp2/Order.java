package Lesson_work_6.srp2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Order {
    //region Сonstructor
    public Order(){

    }
    public Order(String clientName, String product, int qnt, int price) {
        this.clientName = clientName;
        this.product = product;
        this.qnt = qnt;
        this.price = price;
    }
    //endregion

    //region Getters
    public String getClientName() {
        return clientName;
    }

    public String getProduct() {
        return product;
    }

    public int getQnt() {
        return qnt;
    }

    public int getPrice() {
        return price;
    }
    //endregion

    //region Setters
    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public void setQnt(int qnt) {
        this.qnt = qnt;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    //endregion

    //region Private Fields
    private String clientName;

    private String product;

    private int qnt;

    private int price;
    //endregion
}
