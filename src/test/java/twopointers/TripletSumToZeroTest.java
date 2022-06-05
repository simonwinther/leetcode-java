package twopointers;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TripletSumToZeroTest {

    @Test
    void searchTriplets1() {
        int[] array = {-3, 0, 1, 2, -1, 1, -2};
        List<List<Integer>> expected = List.of(
                List.of(-3, 1, 2),
                List.of(-2, 0, 2),
                List.of(-2, 1, 1),
                List.of(-1, 0, 1));
        assertEquals(expected, TripletSumToZero.searchTriplets(array));
    }

    @Test
    void searchTriplets2() {
        int[] array = {-5, 2, -1, -2, 3};
        List<List<Integer>> expected = List.of(
                List.of(-5, 2, 3),
                List.of(-2, -1, 3));
        assertEquals(expected, TripletSumToZero.searchTriplets(array));
    }
}