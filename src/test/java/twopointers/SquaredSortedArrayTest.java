package twopointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquaredSortedArrayTest {

    @Test
    void makeSquares1() {
        int[] input = {-2, -1, 0, 2, 3};
        int[] expected = {0, 1, 4, 4, 9};
        assertArrayEquals(expected, SquaredSortedArray.makeSquares(input));
    }

    @Test
    void makeSquares2() {
        int[] input = {-3, -1, 0, 1, 2};
        int[] expected = {0, 1, 1, 4, 9};
        assertArrayEquals(expected, SquaredSortedArray.makeSquares(input));
    }
}