package slidingwindow;

public class ReplacingOnes {
    public static int findLength(int[] arr, int k) {
        int windowStart = 0, maxLength = 0, onesCount = 0;

        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            if (arr[windowEnd] == 1)
                onesCount++;

            if (windowEnd - windowStart + 1 - onesCount > k){
                if(arr[windowStart] == 1)
                    onesCount--;
                windowStart++;
            }
            maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
        }
        return maxLength;
    }
}
