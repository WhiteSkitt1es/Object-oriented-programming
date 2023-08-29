package Lesson_work_1;

public class BottleOfWater extends Product {

    private double volume; // Объем

    public double getVolume() {
        return volume;
    }

    public BottleOfWater(String name, String brand, double price, double volume) {
        super(name, brand, price);
        this.volume = volume;
    }

    @Override
    public String displayInfo() {
        return String.format("[Бутылка с водой] %s - %s - %.2f - v: %.2f", name, brand, price, volume);
    }
}
