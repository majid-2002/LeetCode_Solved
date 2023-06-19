public class removeElement {
    public static int removeelement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val)
                nums[k++] = nums[i];
        }

        return k;
    }

    public static void main(String[] args) {
        int[] nums = { 0, 1, 2, 2, 3, 4 };
        int val = 2;

        int res = removeelement(nums, val);
        System.out.println(res);

    }
}

// 0, 1, 2, 2, 3, 4

// i = 0 , k = 0;
// 0, 1, 2, 2, 3, 4

// i = 1 , k = 1;
// 0, 1, 2, 2, 3, 4

// i = 2, k = 2;
// 0, 1, 2, 2, 3, 4

// i = 3, k = 2;
// 0, 1, 2, 2, 3, 4

// i = 4, k = 2;
// 0, 1, 3, 2, 3, 4

// i = 5, k = 3;
// 0, 1, 3, 4, 3, 4

// i = 5, k = 4