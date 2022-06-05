package slidingwindow;

import java.util.HashMap;

public class PermutationInString {
    public static boolean findPermutation(String str, String pattern) {
        HashMap<Character, Integer> patternMap = new HashMap<>();
        HashMap<Character, Integer> freqMap = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            patternMap.put(
                    pattern.charAt(i),
                    patternMap.getOrDefault(pattern.charAt(i), 0) + 1);
        }

        int windowStart = 0;
        for (int windowEnd = 0; windowEnd < str.length(); windowEnd++) {
            char currentChar = str.charAt(windowEnd);
            freqMap.put(currentChar, freqMap.getOrDefault(currentChar, 0) + 1);

            if(freqMap.equals(patternMap))
                return true;

            if(windowEnd >= pattern.length() - 1){
                char startChar = str.charAt(windowStart);
                freqMap.put(startChar, freqMap.get(startChar) - 1);

                if(freqMap.get(startChar) == 0)
                    freqMap.remove(startChar);

                windowStart++;
            }
        }
        return false;
    }
}
