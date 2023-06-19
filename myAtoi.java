public class myAtoi {
    public static int stringReplace(String s) {
        int i = 0;
        int sign = 1;
        int result = 0;

        s = s.trim();

        // Check if the string is empty
        if (s.isEmpty()) {
            return 0;
        }

        if (s.charAt(i) == '-' || s.charAt(i) == '+') {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';// substract the unicode value of 0, like 48 for 0

            if (s.charAt(i) == '.')
                break;

            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && digit > 7)) {
                return (sign == -1) ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }

            result = result * 10 + digit;

            i++;
        }

        return result * sign;
    }

    public static void main(String[] args) {
        System.out.println(stringReplace("4555 with words"));
    }

}


//for the input "4555 with words"
// when does the "with words" part get removed?
// the "4"