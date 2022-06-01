import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmallestSubarrayGreaterSumTest {

    @Test
    void findMinSubArray1() {
        int[] array = {2, 1, 5, 2, 3, 2};
        int S = 7;
        assertEquals(2, SmallestSubarrayGreaterSum.findMinSubArray(S, array));
    }

    @Test
    void findMinSubArray2() {
        int[] array = {2, 1, 5, 2, 8};
        int S = 7;
        assertEquals(1, SmallestSubarrayGreaterSum.findMinSubArray(S, array));
    }

    @Test
    void findMinSubArray3() {
        int[] array = {3, 4, 1, 1, 6};
        int S = 8;
        assertEquals(3, SmallestSubarrayGreaterSum.findMinSubArray(S, array));
    }
}