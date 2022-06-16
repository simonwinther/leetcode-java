package twopointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuadrupleSumToTarget {

    public static List<List<Integer>> searchQuadruplets(int[] arr, int target) {
        Arrays.sort(arr);
        List<List<Integer>> quadruplets = new ArrayList<>();

        for (int i = 0; i < arr.length - 3; i++) {
            if (i > 0 && arr[i] == arr[i - 1])
                continue;
            for (int j = i + 1; j < arr.length - 2; j++) {
                if (j > i + 1 && arr[j] == arr[j - 1])
                    continue;
                searchPairs(arr, target, i, j, quadruplets);
            }
        }
        return quadruplets;
    }

    private static void searchPairs(int[] arr, int target, int i, int j, List<List<Integer>> quadruplets) {
        int left = j + 1;
        int right = arr.length - 1;

        while(left < right){
            int sum = arr[i] + arr[j] + arr[left] + arr[right];

            if(sum == target){
                quadruplets.add(Arrays.asList(arr[i], arr[j], arr[left], arr[right]));
                left++;
                right--;
                while (left < right && arr[left] == arr[left - 1])
                    left++;
                while(left < right && arr[right] == arr[right +1])
                    right--;
            } else if (sum < target)
                left++;
            else
                right--;
        }
    }
}
