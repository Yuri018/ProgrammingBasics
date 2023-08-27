package practicum.unit_tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayTemperatureTest {

    ArrayTemperature arrayTemperature;

    @BeforeEach
    void setUp() {
        arrayTemperature = new ArrayTemperature();
    }

    @Test
    void minValueArray() {
        double[] array = {10, 20, 30 ,40 ,50};
        assertEquals(10, ArrayTemperature.minValueArray(array));
    }

    @Test
    void findTemperatureDifference() {
        double min = 10;
        double max = 50;
        double difference = 40;
        assertEquals(difference, ArrayTemperature.findTemperatureDifference(min, max));
    }

    @Test
    void averageTemperature() {
        double min = 10;
        double max = 50;
        double average = 30;
        assertEquals(average, ArrayTemperature.averageTemperature(min, max));
    }

    @Test
    void downwardDeviation() {
        double average = 30;
        double min = 10;
        double minDeviation = 20;
        assertEquals(minDeviation, ArrayTemperature.downwardDeviation(average, min));
    }

    @Test
    void bigDeviation() {
        double average = 30;
        double max = 50;
        double maxDeviation = 20;
        assertEquals(maxDeviation, ArrayTemperature.bigDeviation(average, max));
    }
}