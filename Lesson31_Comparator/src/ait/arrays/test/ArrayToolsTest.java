package ait.arrays.test;

import ait.arrays.utils.ArrayTools;
import ait.solder.model.Solder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class ArrayToolsTest {

    Integer[] arrNum;

    String[] arrStr;
    Solder[] solders;


    @BeforeEach
    void setUp() {
        arrNum = new Integer[]{1, 4, 3, 2, 5, 6, 9, 8, 7, 3};
        arrStr = new String[]{"one", "two", "three", "four", "five"};
        solders = new Solder[]{
                new Solder("John", 182, 82.3, 91),
                new Solder("Peter", 175, 55.1, 75),
                new Solder("Rabin", 162, 55.1, 91),
                new Solder("Mari", 159, 55.1, 91),
                new Solder("Ann", 162, 55, 88)
        };
    }

    @Test
    void testPrintArray() {
        System.out.println("=====testPrintArray=====");
        ArrayTools.printArray(arrNum);
        ArrayTools.printArray(arrStr);

    }

    @Test
    void testSearch() {
        System.out.println("=====testSearch=====");
        int index = ArrayTools.search(arrStr, "four");
        System.out.println("index " + index);
        index = ArrayTools.search(arrStr, "ten");
        System.out.println("index " + index);
        index = ArrayTools.search(arrNum, 5);
        System.out.println("index " + index);
        index = ArrayTools.search(arrNum, 8);
        System.out.println("index " + index);
    }

    @Test
    void testFindByPredicate() {
        System.out.println("=====testByPredicate=====");
        Integer res = ArrayTools.findByPredicate(arrNum, n -> n < 5);
        System.out.println(res);
        res = ArrayTools.findByPredicate(arrNum, n -> n % 5 == 0);
        System.out.println(res);
        String str = ArrayTools.findByPredicate(arrStr, s -> s.length() == 4);
        System.out.println(str);
    }

    @Test
    void testBubbleSort() {
        System.out.println("=====testBubbleSort=====");
//        ArrayTools.bubbleSort(arrNum);
        Arrays.sort(arrNum);
        ArrayTools.printArray(arrNum);
        System.out.println("_______________");
//        ArrayTools.bubbleSort(arrStr);
        Arrays.sort(arrStr);
        ArrayTools.printArray(arrStr);
        System.out.println("_______________");
//        ArrayTools.bubbleSort(solders);
        Arrays.sort(solders);
        ArrayTools.printArray(solders);
    }

    @Test
    void testSortSolderByName() {
        System.out.println("=====testSortSolderByName=====");
//        ArrayTools.bubbleSort(solders, (s1, s2) -> s1.getName().compareTo(s2.getName()));
        Arrays.sort(solders, (s1, s2) -> s1.getName().compareTo(s2.getName()));
        ArrayTools.printArray(solders);
    }

    @Test
    void testSortSolderByProfile() {
        System.out.println("=====testSortSolderByProfile=====");
        ArrayTools.bubbleSort(solders, (s1, s2) -> s1.getProfile() - (s2.getProfile()));
//        Arrays.sort(solders, (s1, s2) -> s1.getProfile() - (s2.getProfile()));
        ArrayTools.printArray(solders);
    }

    @Test
    void testSortSolderByWeight() {
        System.out.println("=====testSortSolderByName=====");
        Arrays.sort(solders, (s1, s2) -> {
            double res = s1.getWeight() - (s2.getWeight());
            if (res < 0) {
                return -1;
            }
            if (res > 0) {
                return 1;
            }
            return 0;
        });
        ArrayTools.printArray(solders);
    }

    @Test
    void testSortSolderByLength() {
        System.out.println("=====testSortSolderByName=====");
        ArrayTools.bubbleSort(arrStr, (s1, s2) -> s1.length() - (s2.length()));
        Arrays.sort(arrStr, (s1, s2) -> s1.length() - (s2.length()));
        ArrayTools.printArray(arrStr);
    }
}