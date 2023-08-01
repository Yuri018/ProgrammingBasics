package practicum;

public class FindElementInArray {
    public static void main(String[] args) {
        /*
        реализуйте метод, который получает на вход массив, искомое число и отвечает на вопрос,
        нашлось ли это число в массиве.
         */
        //Шаг 1 - создать массив
        //Шаг 2 - сделать метод

        int[] array = {14, 73, 28, 8, -15, -45, 21, -999};

        int a = 7;

        findElInArray(array, a);
    }

    public static void findElInArray(int[] arr, int x) {
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == x){
                flag = true;
            }
        }
        if (flag) {
            System.out.println("Element " + x + " presents in array");
        } else {
            System.out.println("Element " + x + " isn't presents in array");
        }
    }
}
