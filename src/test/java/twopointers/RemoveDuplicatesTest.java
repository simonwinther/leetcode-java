package twopointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesTest {

    @Test
    void remove1() {
        int[] array = {2, 3, 3, 3, 6, 9, 9};
        int expected = 4;
        assertEquals(expected, RemoveDuplicates.remove(array));
    }

    @Test
    void remove2() {
        int[] array = {2, 2, 2, 11};
        int expected = 2;
        assertEquals(expected, RemoveDuplicates.remove(array));
    }
}