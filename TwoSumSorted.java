public class TwoSumSorted {

    public static int[] twoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int[] res = new int[2];

        while (left < right) {
            if ((nums[left] + nums[right]) > target) {
                right--;
            } else if ((nums[left] + nums[right]) < target) {
                left++;
            } else {
                res[0] = left + 1;
                res[1] = right + 1;
                return res;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 7, 11, 15 };
        int[] res = twoSum(arr, 9);
        System.out.println(res[0] + " " + res[1]); // ?

    }

}
