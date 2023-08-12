package practicum.students;

import java.util.Arrays;

public class SmartArray {

    private int size;
    private int[] array = new int[3];

    public void add(int element){//метод добавления элемента в массив и отображение количества заполненных элементов
                                 //в пересенной size
        if (size < array.length) {
            array[size] = element;
            size++;
        } else {
            increaseArray();
            array[size] = element;
            size++;
        }
    }

    private void increaseArray(){//метод увеличения массива с помощью создания временного массива и увеличения массива
        // на величину size. Присвоение значений временного массива основному массиву
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

    public int[] getArray(){//зашищает основной массив от изменений извне. Т.е. создаем копию массива и через
        //этот метод даем доступ к основному массиву (его копии)
        int[] tempArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            tempArray[i] = array[i];
        }
        return tempArray;
    }
}
