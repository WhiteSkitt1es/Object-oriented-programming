package Lesson_work_6.isp;

public class CustomPaymentService extends PaymentService implements WebMoneyPayable, CreditCardPayable {
    @Override
    public void payWebMoney(int amount) {
        System.out.printf("Custom pay by web money %d\n", amount);
    }

    @Override
    public void payCreditCard(int amount) {
        System.out.printf("Custom pay by credit card %d\n", amount);
    }


}
