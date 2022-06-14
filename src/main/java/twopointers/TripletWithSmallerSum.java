package twopointers;

import java.util.Arrays;

public class TripletWithSmallerSum {
    public static int searchTriplets(int[] arr, int target) {
        Arrays.sort(arr);
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            count += searchPair(arr, target - arr[i], i);
        }

        return count;
    }

    private static int searchPair(int[] arr, int targetSum, int first) {
        int count = 0;

        int left = first + 1, right = arr.length - 1;

        while(left < right){
            if(arr[left] + arr[right] < targetSum){
                count += right - left;
                left++;
            } else {
                right--;
            }
        }
        return count;
    }
}
