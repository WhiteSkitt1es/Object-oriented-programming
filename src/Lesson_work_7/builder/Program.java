package Lesson_work_7.builder;

public class Program {

    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder("AAA");
        String s = stringBuilder
                .append("BVV")
                .append("CCCC")
                .insert(2, "DDD")
                .append("GGG")
                .toString();


        Order order = new OrderBuilder()
                .setProductId(100023)
                .setClientName("AAAA")
                .setQnt(2)
                .setSign(true)
                .setProductName("BBBBB")
                .setPrice(200)
                .build();
    }

}
