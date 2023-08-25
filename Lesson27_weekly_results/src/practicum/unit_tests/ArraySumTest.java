package practicum.unit_tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArraySumTest {

    ArraySum arraySum;

    @BeforeEach
    void setUp() {
        arraySum = new ArraySum();
    }

    @Test
     void sumElOddIndex() {
        int[] arr = {10, 20, -30, 40};//создаем тестовый массив
        //элементы в нечетным индексом 20 и 40
        assertEquals(60, ArraySum.sumElOddIndex(arr));
    }
}