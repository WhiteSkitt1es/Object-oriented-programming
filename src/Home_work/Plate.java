package Home_work;

public class Plate {
    private int food;

    public Plate(int food) {
        if(food > 100 || food < 0){
            throw new RuntimeException("Введите значение от 0 до 100");
        }
        this.food = food;
    }

    public void setFood(int food) {
        if (food < 0) {
            System.out.println("В миске недостаточно еды");
        } else {
            this.food = food;
        }
    }

    public void appendFood(int value){
        if(food + value > 100){
            System.out.println("Миска переполненна");
        } else {
            this.food = food + value;
        }
    }

    public int getFood() {
        return food;
    }

    public void info(){
        System.out.println("plate: " + food);
    }
}
