import org.junit.jupiter.api.Test;
import slidingwindow.AnagramsInString;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AnagramsInStringTest {

    @Test
    void findStringAnagrams1() {
        String str = "ppqp";
        String pattern = "pq";

        List<Integer> expected = List.of(1, 2);

        assertEquals(expected, AnagramsInString.findStringAnagrams(str, pattern));
    }

    @Test
    void findStringAnagrams2() {
        String str = "abbcabc";
        String pattern = "abc";

        List<Integer> expected = List.of(2, 3, 4);

        assertEquals(expected, AnagramsInString.findStringAnagrams(str, pattern));
    }
}