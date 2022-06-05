package twopointers;

public class RemoveDuplicates {
    public static int remove(int[] arr) {
        int nextNonDuplicate = 1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[nextNonDuplicate - 1] != arr[i]){
                arr[nextNonDuplicate] = arr[i];
                nextNonDuplicate++;
            }
        }
        return nextNonDuplicate;
    }
}
