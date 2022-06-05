package twopointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PairWithTargetSumTest {

    @Test
    void search() {
        int[] arr = {1, 2, 3, 4, 6};
        int target = 6;
        int[] expected = {1, 3};

        assertArrayEquals(expected, PairWithTargetSum.search(arr, target));
    }

    @Test
    void search2() {
        int[] arr = {1, 2, 3, 4, 6};
        int target = 6;
        int[] expected = {1, 3};

        assertArrayEquals(expected, PairWithTargetSum.search2(arr, target));
    }
}