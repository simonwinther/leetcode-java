package slidingwindow;

import java.util.HashMap;

public class CharacterReplacement {

    public static int findLength(String str, int k) {
        if(str.isEmpty())
            return 0;
        int windowStart = 0, maxRepeatingLetterCount = 0;
        HashMap<Character , Integer> freqMap = new HashMap<>();
        int maxLength = 0;

        for (int windowEnd = 0; windowEnd < str.length(); windowEnd++) {
            char currentChar = str.charAt(windowEnd);
            freqMap.put(currentChar, freqMap.getOrDefault(currentChar, 0) + 1);
            maxRepeatingLetterCount = Math.max(maxRepeatingLetterCount, freqMap.get(currentChar));

            if(windowEnd - windowStart + 1 - maxRepeatingLetterCount > k){
                char startChar = str.charAt(windowStart);

                freqMap.put(startChar, freqMap.get(startChar) - 1);
                windowStart++;
            }

            maxLength = Math.max(maxLength, windowEnd - windowStart + 1);

        }
        return maxLength;
    }
}
