package practicum;

import java.util.Arrays;

public class Cart {
    private int size;
    private Product[] array = new Product[3];

    public void add(Product element) {//метод добавления элемента в массив и отображение количества заполненных элементов
        //в переменной size
        if (size <= array.length) {
            array[size] = element;
            size++;
        } else {
            increaseArray();
            array[size] = element;
            size++;
        }
    }

    public void remove(int index) {
        if (index > 0 && index < size) {
            for (int i = index + 1; i < size; i++) {
                array[i - 1] = array[i];
            }
            size--;
        }
    }

    public void removeById(int id) {
        int index = getIndexById(id);
        remove(index);
    }

    public int getIndexById(int id) {
        int res = -1;
        for (int i = 0; i < size; i++) {
            if (array[i].getId() == id) return i;
        }
        return res;
    }

    private void increaseArray() {//метод увеличения массива с помощью создания временного массива и увеличения массива
        // на величину size. Присвоение значений временного массива основному массиву
        Product[] tempArray = new Product[array.length * size];
        for (int i = 0; i < array.length; i++) {
            tempArray[i] = array[i];
        }
        array = tempArray;
    }


    public String toString() {
        String result = "";
        for (int i = 0; i < size; i++) {
            result += array[i] + "|";
        }
        return result;
    }

    public Product[] getArray() {//зашищает основной массив от изменений извне. Т.е. создаем копию массива и через
        //этот метод даем доступ к основному массиву (его копии)
        Product[] tempArray = new Product[size];
        for (int i = 0; i < size; i++) {
            tempArray[i] = array[i];
        }
        return tempArray;
    }

    public int quantity() {
        return size;
    }

    public double sum() {
        double sum = 0;
        for (int i = 0; i < size; i++) {
            sum += array[i].getPrice();
        }
        return sum;
    }
}
