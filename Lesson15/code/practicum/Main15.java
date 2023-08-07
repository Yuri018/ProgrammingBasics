package practicum;

public class Main15 {
    public static void main(String[] args) {
        //find the last negative number in the array and display it on the screen. If there are none, output 0.

        int[] arrayNum = {14, 73, 28, 8, 15, 45, 0, -21, 999};

        System.out.println(findLastNegativeNumber(arrayNum));
        System.out.println(findLastNegativeNumber2(arrayNum));
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

    public static int findLastNegativeNumber2(int[] arr){
        int lastNum = 0;
        for (int i = arr.length - 1; i >= 0; i--){//traverse the array from the end
            if (arr[i] < 0){
                return arr[i];
            }
        }
        return lastNum;
    }
}
