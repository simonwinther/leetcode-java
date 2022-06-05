import org.junit.jupiter.api.Test;
import slidingwindow.ReplacingOnes;

import static org.junit.jupiter.api.Assertions.*;

class ReplacingOnesTest {

    @Test
    void findLength1() {
        int[] array = {0, 1, 1, 0, 0, 0, 1, 1, 0, 1, 1};
        int K = 2;
        assertEquals(6, ReplacingOnes.findLength(array, K));
    }

    @Test
    void findLength2() {
        int[] array = {0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 0, 1, 1};
        int K = 3;
        assertEquals(9, ReplacingOnes.findLength(array, K));
    }
}