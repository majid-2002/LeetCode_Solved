public class ReverseInteger {

    public static int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int digit = x % 10; // right most digit;
            x /= 10; // remove right most digit;
            if ((rev > Integer.MAX_VALUE / 10) || ((rev == Integer.MAX_VALUE / 10) && digit > 7))
                return 0;
            if ((rev < Integer.MIN_VALUE / 10) || ((rev == Integer.MIN_VALUE / 10) && digit < -8))
                return 0;
            rev = rev * 10 + digit;
        }
        x = rev;
        return x;
    }

    public static void main(String[] args) {
        System.out.println(reverse(2147483647));
    }

}
