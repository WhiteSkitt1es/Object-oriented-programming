package Lesson_work_4;

public class ArrayUtils {

    public static <T> T[] replaceTwoElements(T[] array, int index1, int index2){
        if (array == null)
            throw new NullPointerException();
        if (index1 >= array.length || index2 >= array.length || index1 < 0 || index2 < 0)
            throw new IndexOutOfBoundsException();
        T[] arr = array.clone();
        T obj = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = obj;
        return arr;
    }


}
