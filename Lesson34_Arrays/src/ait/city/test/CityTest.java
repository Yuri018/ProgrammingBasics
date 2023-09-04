package ait.city.test;

import ait.city.model.City;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

class CityTest {
    City[] cities;

    @BeforeEach
    void setUp() {
        cities = new City[6];
        cities[0] = new City("Denver", 600_000);
        cities[1] = new City("Boston", 670_000);
        cities[2] = new City("Chicago", 2_700_000);
        cities[3] = new City("Atlanta", 470_000);
        cities[4] = new City("New York", 8_500_000);
        cities[5] = new City("Dallas", 1_300_000);

    }
    private void printArray(Object[] arr, String title){
        System.out.println("========" + title + "========");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    @Test
    void testComparable(){
        printArray(cities, "Original Array");
        Arrays.sort(cities);
        printArray(cities, "Natural order");
        City city = new City("Dallas", 1_300_000);
        int index = Arrays.binarySearch(cities, city);
        System.out.println("Index - " + index);
    }

    @Test
    void testComparator(){
        Comparator<City> comparator = (c1, c2) -> c1.getName().compareTo(c2.getName());
        Arrays.sort(cities, comparator);
        printArray(cities, "Sort by name");
        City pattern = new City("Chicago", 0);
        int index = Arrays.binarySearch(cities, pattern, comparator);
        System.out.println("index = " + index);
    }

    @Test
    void testArrayCopy(){
//        City[] citiesCopy = cities;//так передается только ссылка и ниже сортируется массив cities
        City[] citiesCopy2 = Arrays.copyOf(cities, cities.length * 2);
        printArray(citiesCopy2, " citiCopy before sort by cities ");
        Arrays.sort(cities);
        printArray(citiesCopy2, " citiCopy after sort by cities ");
        Comparator<City> comparator = (c1, c2) -> c1.getName().compareTo(c2.getName());
//        Arrays.sort(citiesCopy2, comparator);//ошибка сортировки из-за null
        Arrays.sort(citiesCopy2, 0,cities.length, comparator);//так сортировка проходит
        printArray(citiesCopy2, "cityCopy2 sort by name");

        City pattern = new City("Yalta", 0);
        int index = Arrays.binarySearch(citiesCopy2, 0, cities.length, pattern, comparator);
        System.out.println("Index = " + index);// если не найдено, будет -1 и место расположения в массиве -7
    }

    @Test
    void testCopyOfRange(){
        City[] citiesCopyOfRange = Arrays.copyOfRange(cities, 1, 8/* или cities.length + 3 */);
        printArray(citiesCopyOfRange, " citiesCopyOfRange ");
    }

    @Test
    void testSystemArrayCopy(){
        City[] destCopy = new City[cities.length * 2];//длину можно задать цифрами
        System.arraycopy(cities, 1, destCopy, 4, cities.length - 2);
        printArray(destCopy,"System.arraycopy");
    }

    @Test
    void testKeepSorted(){
        Arrays.sort(cities);
        printArray(cities, "Natural order");
        City city = new City("Salem", 690_000);
        City[] citiesCopy = Arrays.copyOf(cities, cities.length + 1);

        int index = Arrays.binarySearch(citiesCopy, 0, citiesCopy.length - 1, city);
        index = index >= 0 ? index : -index - 1;
        System.arraycopy(citiesCopy, index, citiesCopy, index + 1, citiesCopy.length - index -1);
        citiesCopy[index] = city;
        printArray(citiesCopy, "after added city");
    }
}