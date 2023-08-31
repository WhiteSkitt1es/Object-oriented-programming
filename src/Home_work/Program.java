package Home_work;

public class Program {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Барсик",5),
                new Cat("Рыжик",7),
                new Cat("Коксик",8),
                new Cat("Снежок",3),
                new Cat("Пушок",5)
        };
        Plate plate = new Plate(-1);
        plate.info();
        for (Cat cat:cats) {
            cat.eat(plate.getFood());
            plate.setFood(plate.getFood() - cat.getAppetite());
        }
        plate.info();
        for (Cat cat:cats) {
            cat.getSatiety();
        }
        plate.appendFood(8);
        plate.info();
        plate.appendFood(8);
        plate.info();
        plate.appendFood(8);
        plate.info();
        plate.appendFood(8);
        plate.info();
    }
}
