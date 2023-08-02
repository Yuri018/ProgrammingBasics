package homeWork12;

public class Main12 {
    public static void main(String[] args) {
        System.out.println("-----------Task 1-----------");
        String word = "Hello";
        System.out.println(returnChars(word));

        System.out.println("-----------Task 2-----------");
        int[] arrayNum = {14, 73, 28, 8, -15, -45, 0, 21, -999};
        System.out.println(checkOnesAndZeros(arrayNum));

        System.out.println("-----------Task 3-----------");
        //для простоты использую массив со второй задачи
        int findNum = 0;
        System.out.println(findNumberInArray(arrayNum, findNum));
    }

    //Task 1
    static String returnChars(String str) {
        return str.substring(1, 3).toUpperCase();
    }

    //Task 2
    static boolean checkOnesAndZeros(int[] array) {
        for (int k : array) {
            if (k == 0 || k == -1) {
                return true;
            }
        }
        return false;
    }

    static int findNumberInArray(int[] array, int x) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                return i;
            }
        }
        return -1;
    }
}
