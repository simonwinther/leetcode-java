package twopointers;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SubarrayProductLessTest {

    @Test
    void findSubarrays1() {
        int[] arr = {2, 5, 3, 10};
        int target = 30;
        List<List<Integer>> subarrays = List.of(
                List.of(2),
                List.of(5),
                List.of(2, 5),
                List.of(3),
                List.of(5, 3),
                List.of(10));
        assertEquals(subarrays, SubarrayProductLess.findSubarrays(arr, target));
    }

    @Test
    void findSubarrays2() {
        int[] arr = {8, 2, 6, 5};
        int target = 50;
        List<List<Integer>> subarrays = List.of(
                List.of(8),
                List.of(2),
                List.of(8, 2),
                List.of(6),
                List.of(2, 6),
                List.of(5),
                List.of(6, 5));
        assertEquals(subarrays, SubarrayProductLess.findSubarrays(arr, target));
    }
}