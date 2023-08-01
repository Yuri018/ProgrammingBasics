package homeWork11;

public class FlipArray {
    public static void main(String[] args) {
        int[] array = {14, 73, 28, 8, -15, -45, 21, -999};
        flipArray(array);
        System.out.println();
        flipArray2(array);
    }
    public static void flipArray(int[] arr){
        for (int i = arr.length - 1; i >= 0; i--){
            System.out.print(arr[i] + "|");
        }
    }
    public static void flipArray2 (int[] arr){
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        for (int j : arr) {
            System.out.print(j + "|");
        }
    }
}
