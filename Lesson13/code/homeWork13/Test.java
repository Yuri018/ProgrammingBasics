package homeWork13;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = scanner.nextInt();
        int[] divisors = getDivisors(num);
        System.out.println(Arrays.toString(divisors));
        System.out.print("Делители числа " + num + ": ");
        for (int divisor : divisors) {
            if (divisor != 0) {
                System.out.print(divisor + " ");
            }
        }
    }

    public static int[] getDivisors(int n) {
        int[] divisors = new int[n];
        int index = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                divisors[index] = i;
                index++;
            }
        }
        return divisors;
    }
}

