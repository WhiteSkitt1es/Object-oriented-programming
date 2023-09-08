package Lesson_work_4.homework;

import java.util.ArrayList;

public class Box<T extends Fruit>  {

    private final ArrayList<T> fructs;

    public Box() {
        this.fructs = new ArrayList<>();
    }
    public float getWeightBox(){
        float result = 0;
        for (T fruct: fructs) {
            result += fruct.getWeight();
        }
        return result;
    }
    public void addFruct(T fruct){
        fructs.add(fruct);
    }
    public T getFruit(){
        return fructs.get(fructs.size() - 1);
    }
    public int getQuantity(){
        return fructs.size();
    }
    public void isEmpty(){
        fructs.clear();
    }
    public void sprinkle(Box<T> box){
        for (int i = 0; i < box.getQuantity(); i++) {
            addFruct(getFruit());
        }
        box.isEmpty();
    }
    public boolean compare(Box box){
        int res = Float.compare(getQuantity(), box.getQuantity());
        if (res == 0){
            return true;
        } else {
            return false;
        }
    }

}
