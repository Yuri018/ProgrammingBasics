package sortArray;

public class Array {

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = searchMin(arr, i, arr.length);
            if (arr[min] < arr[i]) {
                swap(arr, i, min);
            }
        }
    }

    private static int searchMin(int[] arr, int iMin, int iMax) {//МЕтод возвращает индекс минимального элемента массива
        int index = iMin;
        for (int i = iMin; i < iMax; i++) {
            if (arr[i] < arr[index]) {
                index = i;
            }
        }
        return index;
    }

    private static void swap(int[] arr, int min, int max) {//меняет местами элементы
        int temp = arr[min];
        arr[min] = arr[max];
        arr[max] = temp;
    }
}
