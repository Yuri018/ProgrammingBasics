package practicum.students;

import java.util.Arrays;

public class SmartArray {

    private int size;
    private int[] array = new int[3];

    public void add(int element){
        if (size < array.length) {
            array[size] = element;
            size++;
        } else {
            increaseArray();
            array[size] = element;
            size++;
        }
    }

    private void increaseArray(){
        int[] tempArray = new int[array.length * size];
        for (int i = 0; i < array.length; i++) {
            tempArray[i] = array[i];
        }
        array = tempArray;
    }

    public String defaultToString() {
        return Arrays.toString(array) + " size: " + size;
    }

    public String toString(){
        String result = "";
        for (int i = 0; i < size; i++) {
            result += array[i] + "|";
        }
        return result;
    }

    public int[] getArray(){//зашищает основной массив от изменений извне
        int[] tempArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            tempArray[i] = array[i];
        }
        return tempArray;
    }
}
