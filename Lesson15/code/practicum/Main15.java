package practicum;

public class Main15 {
    public static void main(String[] args) {
        //найти последнее минусовое число в массиве и вывести на экран. Если таких нет вывести 0.

        int[] arrayNum = {14, 73, 28, 8, 15, 45, 0, -21, 999};

        System.out.println(findLastNegativeNumber(arrayNum));
    }

    public static int findLastNegativeNumber(int[] arr) {
        int lastNum = 0;
        for (int j : arr) {
            if (j < 0) {
                lastNum = j;
            }
        }
        return lastNum;
    }
}
