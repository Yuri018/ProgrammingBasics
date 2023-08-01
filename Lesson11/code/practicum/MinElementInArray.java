package practicum;

public class MinElementInArray {
    public static void main(String[] args) {
        /*
        реализуйте метод, который получает на вход массив и находит его минимальный элемент.
         */
        //Шаг 1 - создать массив
        //Шаг 2 - сделать метод

        int[] array = {14, 73, 28, 8, -15, -45, 21, -999};

        minElOfArray(array);

    }

    public static void minElOfArray(int[] arr) {
        //ищем минимальный элемент
        int min = arr[0];
        for (int j : arr) {
            if (j < min) {
                min = j;
            }
        }
        System.out.println("Min element for array is: " + min);
    }
}
