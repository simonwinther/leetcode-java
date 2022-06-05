package twopointers;

import java.util.HashMap;

public class PairWithTargetSum {
    public static int[] search(int[] arr, int targetSum) {
        int left = 0, right = arr.length - 1;
        while (left < right){
            int currentSum = arr[left] + arr[right];
            if(currentSum == targetSum)
                return new int[] {left, right};
            if(targetSum > currentSum)
                left++;
            else
                right--;
        }
        return new int[] { -1, -1 };
    }

    public static int[] search2(int[] arr, int targetSum) {
        HashMap<Integer, Integer> seenNumbers = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            int diff = targetSum - arr[i];

            if(seenNumbers.containsKey(diff)){
                return new int[] {seenNumbers.get(diff), i};
            }
            seenNumbers.put(arr[i], i);
        }

        return new int[] {-1, -1};
    }
}
