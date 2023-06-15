import java.lang.StringBuilder;

public class zigzag {
    public static String convert(String s, int numRows) {
        if (numRows == 1)
            return s;

        StringBuilder res = new StringBuilder();

        for (int r = 0; r < numRows; r++) {
            int increment = (numRows - 1) * 2;

            for (int i = r; i < s.length(); i += increment) {
                res.append(s.charAt(i));

                if (r > 0 && r < numRows - 1 && (i + increment - 2 * r) < s.length()) {
                    res.append(s.charAt(i + increment - 2 * r));
                }

            }
        }

        return res.toString();
    }

    public static void main(String[] args) {
        String word = "PAYPALISHIRING";
        String res = convert(word, 4);
        System.out.println(res);
    }
}