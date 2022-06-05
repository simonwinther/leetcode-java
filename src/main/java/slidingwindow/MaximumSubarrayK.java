package slidingwindow;

public class MaximumSubarrayK {
    public static int findMaxSumSubArray(int k, int[] arr) {
        int windowStart = 0;
        int windowEnd = 0;
        int windowSum = 0;
        int maxSum = 0;

        while (windowEnd < arr.length){
            windowSum += arr[windowEnd];
            if(windowEnd >= k - 1){
                maxSum = Math.max(maxSum, windowSum);

                windowSum -= arr[windowStart];
                windowStart++;
            }
            windowEnd++;
        }
        return maxSum;
    }
}
