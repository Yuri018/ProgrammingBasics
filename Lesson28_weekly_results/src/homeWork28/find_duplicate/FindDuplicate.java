package homeWork28.find_duplicate;


import java.util.Arrays;

public class FindDuplicate {
    public static void main(String[] args) {

        /*
        Задайте массив на 10 элементов и заполните его случайными числами в интервале от -10 до 10.
        Распечатайте полученный массив.
        Создайте метод, который определяет наличие дубликатов в массиве.
        Разработайте соответсвующий тест (набор тестов).
         */
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (10 - (-10) + 1) + (-10));
        }
        System.out.println(Arrays.toString(array));
        findDuplicate(array);
    }

    public static void findDuplicate(int[] arr) {
        Arrays.sort(arr);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                System.out.println("Duplicate found: " + arr[i]);
            }
        }
    }
}
