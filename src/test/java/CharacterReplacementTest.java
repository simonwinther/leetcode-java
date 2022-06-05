import org.junit.jupiter.api.Test;
import slidingwindow.CharacterReplacement;

import static org.junit.jupiter.api.Assertions.*;

class CharacterReplacementTest {

    @Test
    void findLength1() {
        String str = "aabccbb";
        int K = 2;
        assertEquals(5, CharacterReplacement.findLength(str, K));
    }

    @Test
    void findLength2() {
        String str = "abbcb";
        int K = 1;
        assertEquals(4, CharacterReplacement.findLength(str, K));
    }

    @Test
    void findLength3() {
        String str = "abccde";
        int K = 1;
        assertEquals(3, CharacterReplacement.findLength(str, K));
    }
}