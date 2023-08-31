package ait.homeWork31;

import java.util.Comparator;

public class OddEvenComparator {

    //arrNum = new Integer[]{1, 4, 3, 2, 5, 6, 9, 8, 7, 3};
    public static void oddEvenComparator(Integer[] arr, Comparator<Integer> comparator) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (comparator.compare(arr[j], arr[j + 1]) > 0) {
                    Integer temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
