package twopointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TripletWithSmallerSumTest {

    @Test
    void searchTriplets1() {
        int[] arr = {-1, 0, 2, 3};
        int target = 3;

        int count = TripletWithSmallerSum.searchTriplets(arr, target);
        assertEquals(2, count);
    }

    @Test
    void searchTriplets2() {
        int[] arr = {-1, 4, 2, 1, 3};
        int target = 5;

        int count = TripletWithSmallerSum.searchTriplets(arr, target);
        assertEquals(4, count);
    }
}