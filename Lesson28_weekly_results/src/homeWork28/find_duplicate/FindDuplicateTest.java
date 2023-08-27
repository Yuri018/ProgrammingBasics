package homeWork28.find_duplicate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindDuplicateTest {

    FindDuplicateTest findDuplicateTest;

    @BeforeEach
    void setUp() {
        findDuplicateTest = new FindDuplicateTest();
    }

    @Test
    void findDuplicate() {
        int[] array = {10, 20, 20, 41};
        assertEquals(array[1], array[2]);
    }
}