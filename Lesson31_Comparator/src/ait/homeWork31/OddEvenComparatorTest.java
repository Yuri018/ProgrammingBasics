package ait.homeWork31;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class OddEvenComparatorTest {

    Integer[] arrNum;

    @BeforeEach
    void setUp() {
        arrNum = new Integer[]{1, 4, 3, 2, 5, 6, 9, 8, 7, 3};
    }

    @Test
    void oddEvenComparator() {
        Arrays.sort(arrNum, (a, b) -> {
            if (a % 2 == 0 && b % 2 != 0){
                return -1;
            } else if (a % 2 != 0 && b % 2 == 0) {
                return 1;
            } else return a.compareTo(b);
        });
        System.out.println(Arrays.toString(arrNum));
    }
}