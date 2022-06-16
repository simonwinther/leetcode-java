package twopointers;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class QuadrupleSumToTargetTest {

    @Test
    void searchQuadruplets1() {
        int[] array = {4, 1, 2, -1, 1, -3};
        int target = 1;
        List<List<Integer>> expected = List.of(
                List.of(-3, -1, 1, 4),
                List.of(-3, 1, 1, 2));
        assertEquals(expected, QuadrupleSumToTarget.searchQuadruplets(array, target));
    }

    @Test
    void searchQuadruplets2() {
        int[] array = {2, 0, -1, 1, -2, 2};
        int target = 2;
        List<List<Integer>> expected = List.of(
                List.of(-2, 0, 2, 2),
                List.of(-1, 0, 1, 2));
        assertEquals(expected, QuadrupleSumToTarget.searchQuadruplets(array, target));
    }
}