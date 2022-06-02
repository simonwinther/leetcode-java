import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubstringKDistinctTest {
    @Test
    void findLength1() {
        String str = "araaci";
        int K = 2;
        assertEquals(4, LongestSubstringKDistinct.findLength(str, K));
    }

    @Test
    void findLength2() {
        String str = "araaci";
        int K = 1;
        assertEquals(2, LongestSubstringKDistinct.findLength(str, K));
    }

    @Test
    void findLength3() {
        String str = "cbbebi";
        int K = 3;
        assertEquals(5, LongestSubstringKDistinct.findLength(str, K));
    }

    @Test
    void findLength4() {
        String str = "cbbebi";
        int K = 10;
        assertEquals(6, LongestSubstringKDistinct.findLength(str, K));
    }
}