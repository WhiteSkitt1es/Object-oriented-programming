package Lesson_work_4.bank;

public class DebetAccount<T extends PersonalData> extends Account<T>{
    public DebetAccount(T data, double amount) {
        super(data, amount);
    }
}