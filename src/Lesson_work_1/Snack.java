package Lesson_work_1;

public class Snack extends Product {
    private String flavor; // Вкус
    private int weight; // Вес упаковки

    public Snack(String name, String brand, double price, String flavor, int weight) {
        super(name, brand, price);
        checkFlavor(flavor);
        checkWeight(weight);
    }

    private void checkFlavor(String flavor) {
        if (flavor == null || flavor.length() < 3) {
            this.flavor = "Classic";
        } else {
            this.flavor = flavor;
        }
    }

    private void checkWeight(int weight) {
        if (weight <= 99) {
            this.weight = 100;
        } else {
            this.weight = weight;
        }
    }

    public String getFlavor() {
        return flavor;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String displayInfo() {
        return String.format("[Снеки]%s - %s - %.2f - %s - вес: %d гр.", name, brand, price, flavor, weight);
    }
}
