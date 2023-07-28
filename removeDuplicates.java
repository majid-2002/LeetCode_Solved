public class removeDuplicates {
    public static int removeDup(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int k = 1; // k is the left pointer

        for (int i = 1; i < nums.length; i++) { // ? i is the right pointer
            if (nums[i] != nums[i - 1])
                nums[k++] = nums[i];
        }

        return k;
    }

    public static void main(String[] args) {
        int res = removeDup(new int[] { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 });
        System.out.println(res);
    }

}
