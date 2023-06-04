package recursion;

public class isPalindrome {

    public static boolean isPali(String input) {
        if (input.length() == 1 || input.length() == 0) {
            return true;
        }

        if (input.charAt(0) == input.charAt(input.length() - 1)) {
            return isPali(input.substring(1, input.length() - 1));
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPali("no"));
    }

}