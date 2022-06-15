package twopointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DutchFlagTest {

    @Test
    void sort1() {
        int[] arr = {1, 0, 2, 1, 0};
        int[] expected = {0, 0, 1, 1, 2};

        DutchFlag.sort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    void sort2() {
        int[] arr = {2, 2, 0, 1, 2, 0};
        int[] expected = {0, 0, 1, 2, 2, 2};

        DutchFlag.sort(arr);
        assertArrayEquals(expected, arr);
    }
}