package homeWork21;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*
        * разобрать код написанный в классе
        * реализовать программу сортировки массива (используя сортировку выбором)
         */

        int[] array = {4,-2,8,0,7,6,5,-5,77,4};
        System.out.println("Initial array: " + Arrays.toString(array));

        ArraysWork.sortArray(array);
        System.out.println("Sorted array: " + Arrays.toString(array));

    }
}
