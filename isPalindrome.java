public class isPalindrome {
    public static boolean isPali(String s) {
        s = s.trim().replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        if (s.isEmpty())
            return true;

        for (int i = 0; i <= s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1))
                return false;
        }

        return true;

    }

    public static void main(String[] args) {
        String str = " ";
        System.out.println(isPali(str));
    }

}
