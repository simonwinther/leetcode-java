package twopointers;

import java.util.Arrays;


public class SquaredSortedArray {
    public static int[] makeSquares(int[] arr) {
        int[] squares = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            squares[i] = (int) Math.pow(arr[i], 2);
        }
        return Arrays.stream(squares).sorted().toArray();
    }
}
