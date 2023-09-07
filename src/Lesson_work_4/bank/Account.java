package Lesson_work_4.bank;

public abstract class Account<T extends PersonalData> {

    private final T data;
    private double amount;

    public T getData() {
        return data;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Account(T data, double amount) {
        this.data = data;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return String.format("[%s] Доступный лимит: %.2f", data, amount);
    }
}
