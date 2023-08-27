package practicum.unit_tests;

import java.util.Arrays;

public class ArrayTemperature {
    public static void main(String[] args) {
        /*
        Задайте массив для фиксирования данных о дневной температуре за месяц май.
        Заполните массив случайными числами в интервале от 15.0 до 25.0 градусов Цельсия.
        Найдите разницу между минимальной и максимальной температурой за месяц,
        среднюю температуру и отклонение от средней температуры в меньшую и большую сторону.
        Разработайте соответсвующий тест (набор тестов).
         */

        double[] arrayTemperatureInMay = new double[30];
        for (int i = 0; i < arrayTemperatureInMay.length; i++) {
            double t1 = 15.0;
            double t2 = 25.0;
            arrayTemperatureInMay[i] = Math.random() * (t2 - t1 + 1.0) + t1;
        }
        Arrays.sort(arrayTemperatureInMay);

        double min = minValueArray(arrayTemperatureInMay);
        double max = arrayTemperatureInMay.length - 1;
        double difference = findTemperatureDifference(min, max);
        System.out.printf("Difference between min and max temperature in May - %.1f\n", difference);
        double average = averageTemperature(min, max);
        System.out.printf("Average temperature in May - %.1f\n", average);
        double minDeviation = downwardDeviation(average, min);
        System.out.printf("Downward deviation from the average temperature - %.1f\n", minDeviation);
        double maxDeviation = bigDeviation(average, max);
        System.out.printf("Deviation from the average temperature to a large side - %.1f\n", maxDeviation);

    }
    //++++++++++++++++++++METHODS+++++++++++++++++++++++//

    public static double minValueArray(double[] arr) {
        double min = 0;
        for (int i = 0; i < arr.length; i++) {
            min = arr[0];
        }
        return min;
    }

    public static double findTemperatureDifference(double min, double max) {
        return max - min;
    }

    public static double averageTemperature(double min, double max) {
        return (max + min) / 2;
    }

    public static double downwardDeviation(double avg, double min) {
        return avg - min;
    }

    public static double bigDeviation(double avg, double max){
        return max - avg;
    }
}
