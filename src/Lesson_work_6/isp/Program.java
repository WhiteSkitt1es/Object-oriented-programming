package Lesson_work_6.isp;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {
        List<PhonePayable> paymentServices = new ArrayList<>();
        paymentServices.add(new InternetPaymentService());
        //paymentServices.add(new CustomPaymentService());

        for (PhonePayable paymentService : paymentServices){
            paymentService.payPhoneNumber(2000);
            break;
        }

    }

}
