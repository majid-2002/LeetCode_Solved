// https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/description/

import java.util.Arrays;


public class SumZero {
    public int[] sumZero(int n) {
        int[] result = new int[n];

        if (n % 2 == 1) {
            result[0] = 0;
        }

        for (int i = (n % 2 == 1) ? 1 : 0; i < n; i += 2) {
            result[i] = i + 1;
            result[i + 1] = -(i + 1);
        }

        return result;
    }

    public static void main(String[] args) {
        SumZero sz = new SumZero();
        System.out.println(Arrays.toString(sz.sumZero(4)));
    }
}