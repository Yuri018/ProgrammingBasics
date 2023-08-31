package ait.wardrobe.test;

import ait.wardrobe.model.Wardrobe;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;
class WardrobeTest {

    private static final int MAX = 5;
    private static final int SIZE = 10;
    Random random = new Random();

    Wardrobe[] arr;

    @BeforeEach
    void setUp() {
        arr = getWardrobes();
    }

    private Wardrobe[] getWardrobes(){
        Wardrobe[] res = new Wardrobe[SIZE];
        for (int i = 0; i < res.length; i++) {
            double height = 1 + random.nextInt(MAX);
            double width = 1 + random.nextInt(MAX);
            double depth = 1 + random.nextInt(MAX);
            res[i] = new Wardrobe(height, width, depth);
        }
        return  res;
    }
    private void printArray(Wardrobe[] arr, String title){
        System.out.println("+++++++++" + title + "++++++++++");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    @Test
    void testComparableWardrobe(){
        printArray(arr, "Before");
        Arrays.sort(arr);
        printArray(arr, "After");
        int index = Arrays.binarySearch(arr, new Wardrobe(2, 4, 1));
        System.out.println("Index = " + index);
    }

    @Test
    void testAreaComparator(){
        printArray(arr, "Comparator before sort");
        Comparator<Wardrobe> comparator = (w1, w2) -> Double.compare(w1.area(), w2.area());
        Arrays.sort(arr);
        printArray(arr,"Comparator after sort");
        int index = Arrays.binarySearch(arr, new Wardrobe(2,4,1), comparator);
        System.out.println("Index = " + index);
    }

    @Test
    void testVolumeComparator(){
        printArray(arr, "Comparator Volume before sort");
        Comparator<Wardrobe> comparator = (w1, w2) -> Double.compare(w1.volume(), w2.volume());
        Arrays.sort(arr);
        printArray(arr,"Comparator Volume after sort");
        int index = Arrays.binarySearch(arr, new Wardrobe(2,4,1), comparator);
        System.out.println("Index = " + index);
    }

    @Test
    void testHeightVolumeComparator(){
        printArray(arr, "Test Height Volume Comparator");
        Comparator<Wardrobe> comparator = (w1, w2) -> {
            int result = Double.compare(w1.getHeight(), w2.getHeight());
            return result != 0 ? result : Double.compare(w1.volume(), w2.volume());
        };
        Arrays.sort(arr);
        printArray(arr,"Comparator Height Volume after sort");
        int index = Arrays.binarySearch(arr, new Wardrobe(2,4,1), comparator);
        System.out.println("Index = " + index);
    }

}