package practicumArray;

public class MinElEndIndex {
    public static void main(String[] args) {
        //Задан массив целых чисел: 75, 34, -15, -123, 57, -145, 86, 77, 48, -59.
        //Найдите минимальный элемент массива и его индекс.

        int[] array = {75, 34, -15, -123, 57, -145, 86, 77, 48, -59};

        int i = 0;
        int min = array[0]; //просто берем первый элемент массива
        int pointer = 0; //указатель на элемент

        while (i < array.length) {
            if (array[i] < min) { //если текущий элемент массива меньше min
                min = array[i]; // присваиваем min  это минимальное значение
                pointer = i;
            }
            i++;
        }
        System.out.println("Min = " + min + ", index = " + pointer);
    }
}
