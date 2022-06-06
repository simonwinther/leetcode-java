package twopointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TripletSumCloseToTargetTest {

    @Test
    void searchTriplet1() {
        int[] input = {-2, 0, 1, 2};
        int target = 2;
        int expected = 1;
        assertEquals(expected, TripletSumCloseToTarget.searchTriplet(input, target));
    }

    @Test
    void searchTriplet2() {
        int[] input = {-3, -1, 1, 2};
        int target = 1;
        int expected = 0;
        assertEquals(expected, TripletSumCloseToTarget.searchTriplet(input, target));
    }

    @Test
    void searchTriplet3() {
        int[] input = {1, 0, 1, 1};
        int target = 100;
        int expected = 3;
        assertEquals(expected, TripletSumCloseToTarget.searchTriplet(input, target));
    }
}