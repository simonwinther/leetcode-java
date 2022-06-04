import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumWindowSubstringTest {

    @Test
    void findSubstring1() {
        String str = "aabdec";
        String pattern = "abc";
        String expected = "abdec";

        assertEquals(expected, MinimumWindowSubstring.findSubstring(str, pattern));
    }

    @Test
    void findSubstring2() {
        String str = "aabdec";
        String pattern = "abac";
        String expected = "aabdec";

        assertEquals(expected, MinimumWindowSubstring.findSubstring(str, pattern));
    }

    @Test
    void findSubstring3() {
        String str = "abdbca";
        String pattern = "abc";
        String expected = "bca";

        assertEquals(expected, MinimumWindowSubstring.findSubstring(str, pattern));
    }

    @Test
    void findSubstring4() {
        String str = "adcad";
        String pattern = "abc";
        String expected = "";

        assertEquals(expected, MinimumWindowSubstring.findSubstring(str, pattern));
    }
}