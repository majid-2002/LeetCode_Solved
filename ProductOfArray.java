import java.util.Arrays;

public class ProductOfArray {

    public static int[] productExceptSelf(int[] nums) {
        int postfix = 1, prefix = 1;
        int[] arr = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            arr[i] = prefix;
            prefix *= nums[i];
        }

        for(int j = nums.length - 1; j >= 0; j--){
            arr[j] *= postfix;
            postfix *= nums[j];
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(Arrays.toString(productExceptSelf(arr)));
    }
}
