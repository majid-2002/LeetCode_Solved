import java.util.ArrayList;

public class SubArraysInArray {
    public static void reverseInGroups(ArrayList<Integer> arr, int N, int K) {
        int start = 0;

        //? Reverse the array in groups of K
        while (start < N) {
            //? Find the end of the group 
            int end = Math.min(start + K - 1, N - 1); //? If the last group is less than K elements, then reverse the last group
            int left = start;
            int right = end;

            //? Reverse the group
            while (left < right) {
                int temp = arr.get(left);
                arr.set(left, arr.get(right));
                arr.set(right, temp);
                left++;
                right--;
            }

            start += K; //? Move to the next group by incrementing start by K
        }
    }
}
