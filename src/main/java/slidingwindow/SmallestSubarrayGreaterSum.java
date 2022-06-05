package slidingwindow;

public class SmallestSubarrayGreaterSum {
    public static int findMinSubArray(int S, int[] arr) {
        int windowStart = 0;
        int windowEnd = 0;
        int windowSum = 0;
        int minElements = Integer.MAX_VALUE;

        while(windowEnd < arr.length){
            windowSum += arr[windowEnd];
            while (windowSum >= S){
                minElements = Math.min(minElements, windowEnd - windowStart + 1);
                windowSum -= arr[windowStart];
                windowStart++;
            }
            windowEnd++;
        }

        if (minElements == Integer.MAX_VALUE)
            minElements = 0;
        return minElements;
    }
}
