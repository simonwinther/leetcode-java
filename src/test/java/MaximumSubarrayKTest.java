import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumSubarrayKTest {

    @Test
    void findMaxSumSubArray1() {
        int[] array = {2, 1, 5, 1, 3, 2};
        int k = 3;
        assertEquals(9, MaximumSubarrayK.findMaxSumSubArray(k, array));
    }

    @Test
    void findMaxSumSubArray2() {
        int[] array = {2, 3, 4, 1, 5};
        int k = 2;
        assertEquals(7, MaximumSubarrayK.findMaxSumSubArray(k, array));
    }
}