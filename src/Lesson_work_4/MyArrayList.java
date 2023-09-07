package Lesson_work_4;

import java.util.Arrays;
import java.util.Iterator;

public class MyArrayList<T> implements Iterable<T> {

    private T[] array;
    private int lastElementIndex = -1;

    public int getCapacity(){
        return array.length;
    }

    public int getSize(){
        return lastElementIndex + 1;
    }

    public MyArrayList(T[] array) {
        this.array = array;

    }

    public void add(T item){
        if (lastElementIndex + 1 < array.length){
            array[++lastElementIndex] = item;
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new MyArrayListIterator();
    }

    class MyArrayListIterator implements Iterator<T>{

        Iterator<T> iterator = Arrays.stream(array).iterator();

        @Override
        public boolean hasNext() {
            return iterator.hasNext();
        }

        @Override
        public T next() {
            return iterator.next();
        }
    }

}
