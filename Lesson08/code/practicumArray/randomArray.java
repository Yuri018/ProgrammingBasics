package practicumArray;

import java.util.Scanner;

public class randomArray {
    public static void main(String[] args) {
        // Задайте массив из 10 случайных натуральных чисел в интервале от 1 до 100.
        // Запросите у пользователя какое-то натуральное число. Определите, есть ли это число в массиве.
        // Создайте и используйте метод searchInArray, который получает на вход массив и искомое число,
        // а возвращает ответ - нашлось ли это число в массиве.

        Scanner scanner = new Scanner(System.in);

        int[] randomArray = new int[10];//обьявили массив
        //надо заполнить массив случайными числами
        int i = 0; // index
        int a = 1;
        int b = 100;
        while (i < randomArray.length) {
            randomArray[i] = (int) (Math.random() * (b - a + 1) + a);
            System.out.print(randomArray[i] + "|");
            i++;
        }
        System.out.println(" Unput number: ");
        int n = scanner.nextInt(); // этой прерменной присваиваем значение, введенное с клавы
        boolean flag = false;
        i = 0;
        while (i < randomArray.length) {
            if (randomArray[i] == n) {
                flag = true;
            }
            i++;

        }
        if (flag) {
            System.out.println("Bingo!!!");
        } else {
            System.out.println(" Sorry...");
        }
    }
}
