import java.util.HashMap;

public class MinimumWindowSubstring {
    public static String findSubstring(String str, String pattern) {
        HashMap<Character, Integer> freqMap = new HashMap<>();

        for (char c : pattern.toCharArray())
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);

        int charMatched = 0;
        int windowStart = 0;
        int minStartIdx = -1;
        int minLength = str.length() + 1;

        for (int windowEnd = 0; windowEnd < str.length(); windowEnd++) {
            char currentChar = str.charAt(windowEnd);

            if (freqMap.containsKey(currentChar)){
                freqMap.put(currentChar, freqMap.get(currentChar) - 1);
                if (freqMap.get(currentChar) >= 0)
                    charMatched++;
            }

            while (charMatched == pattern.length()){
                if(minLength > windowEnd - windowStart + 1){
                    minLength = windowEnd - windowStart + 1;
                    minStartIdx = windowStart;
                }

                char leftChar = str.charAt(windowStart);

                if(freqMap.containsKey(leftChar)){
                    if(freqMap.get(leftChar) == 0)
                        charMatched--;
                    freqMap.put(leftChar, freqMap.get(leftChar) + 1);
                }
                windowStart++;
            }
        }
        return minLength > str.length() ? "" : str.substring(minStartIdx, minStartIdx + minLength);
    }
}
