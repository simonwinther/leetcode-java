import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PermutationInStringTest {

    @Test
    void findPermutation1() {
        String string = "oidbcaf";
        String pattern = "abc";

        assertTrue(PermutationInString.findPermutation(string, pattern));
    }

    @Test
    void findPermutation2() {
        String string = "oidbcaf";
        String pattern = "dc";

        assertFalse(PermutationInString.findPermutation(string, pattern));
    }

    @Test
    void findPermutation3() {
        String string = "bcdxabcdy";
        String pattern = "bcdxabcdy";

        assertTrue(PermutationInString.findPermutation(string, pattern));
    }

    @Test
    void findPermutation4() {
        String string = "aaacb";
        String pattern = "abc";

        assertTrue(PermutationInString.findPermutation(string, pattern));
    }
}