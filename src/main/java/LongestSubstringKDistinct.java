import java.util.HashMap;

public class LongestSubstringKDistinct {
    public static int findLength(String str, int k){
        int windowStart = 0;
        int windowEnd = 0;
        int maxLength = 0;

        HashMap<Character , Integer> freqMap = new HashMap<>();

        while(windowEnd < str.length()){
            char windowEndChar = str.charAt(windowEnd);
            freqMap
                    .put(windowEndChar, freqMap.getOrDefault(windowEndChar,0) + 1);

            while(freqMap.size() > k){
                char windowStartChar = str.charAt(windowStart);
                freqMap.put(windowStartChar, freqMap.get(windowStartChar) - 1);
                if(freqMap.get(windowStartChar) == 0)
                    freqMap.remove(windowStartChar);
                windowStart++;
            }
            maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
            windowEnd++;
        }
        return maxLength;
    }
}
