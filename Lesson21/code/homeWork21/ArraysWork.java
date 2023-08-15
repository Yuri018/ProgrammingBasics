package homeWork21;

public class ArraysWork {

    public static void sortArray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int index = i;
            int min = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    index = j;
                    min = arr[j];
                }
            }
            arr[index] = arr[i];
            arr[i] = min;
        }
    }
}

