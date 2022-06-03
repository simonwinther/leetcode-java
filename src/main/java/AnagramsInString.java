import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AnagramsInString {
    public static List<Integer> findStringAnagrams(String str, String pattern) {
        List<Integer> resultIndices = new ArrayList<>();

        HashMap<Character, Integer> freqMaq = new HashMap<>();
        HashMap<Character, Integer> patternMap = new HashMap<>();

        for (char c: pattern.toCharArray()) {
            patternMap.put(c, patternMap.getOrDefault(c, 0) + 1);
        }

        int windowStart = 0;
        for (int windowEnd = 0; windowEnd < str.length(); windowEnd++) {
            char currentChar = str.charAt(windowEnd);
            freqMaq.put(currentChar, freqMaq.getOrDefault(currentChar, 0) + 1);

            if (freqMaq.equals(patternMap))
                resultIndices.add(windowStart);

            if(windowEnd >= pattern.length() - 1){
                char startChar = str.charAt(windowStart);
                freqMaq.put(startChar, freqMaq.get(startChar) - 1);
                if(freqMaq.get(startChar) == 0){
                    freqMaq.remove(startChar);
                }
                windowStart++;
            }
        }

        return resultIndices;
    }
}
