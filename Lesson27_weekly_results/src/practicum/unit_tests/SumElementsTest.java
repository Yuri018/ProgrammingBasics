package practicum.unit_tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumElementsTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void averageEvenElements() {
        int[] array = {10, 21, 20, 41};
        //четные элементы 10 и 20. Среднее значение 15.0
        assertEquals(15.0, SumElements.averageEvenElements(array));
    }
}