package practicumArray;

public class Marks {
    public static void main(String[] args) {
        //Имеются оценки абитуриента из его аттестата, всего 12 оценок. Найдите средний балл абитуриента.
        int[] marksArr = new int[] {4,5,2,1,1,3,2,5,1,1,2,1};

        int l = marksArr.length;
        System.out.println("Length of array is " + l);

        //надо сложить все элементы массива и поделить на количество элементов (размер массива)

        int result = 0;
        int i = 0;

        while (i < marksArr.length) {
            result = result + marksArr[i]; //накапливаем сумму значений элементов
            i++;
        }
        double averageMark = (double) result / marksArr.length; //вычисляем средний бал
        System.out.printf("Average Mark: %.2f", averageMark);
    }
}
