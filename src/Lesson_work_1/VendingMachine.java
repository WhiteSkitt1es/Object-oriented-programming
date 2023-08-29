package Lesson_work_1;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {

    private List<Product> products;

    public VendingMachine(List<Product> products) {
        if (products == null) {
            products = new ArrayList<>();
        }
        this.products = products;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public BottleOfWater getBottleOfWater(String name, double volume) {
        for (Product product : products) {
            if (product instanceof BottleOfWater) {
                BottleOfWater bottleOfWater = (BottleOfWater) product;
                if (product.getName().equals(name) && bottleOfWater.getVolume() == volume) {
                    return bottleOfWater;
                }
            }
        }
        return null;
    }

    public Snack getSnack(String name, String flavor, int weigh) {
        for (Product product : products) {
            if (product instanceof Snack) {
                Snack snack = (Snack) product;
                if (product.getName().equals(name) && snack.getFlavor().equals(flavor) && snack.getWeight() == weigh) {
                    return snack;
                }
            }
        }
        return null;
    }

}
