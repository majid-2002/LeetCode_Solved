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

// P A Y P A L I S H I R I N G

// P     I     N
// A   L S   I G
// Y A   H	R
// P     I

// pseudocode:

// 	if(numrows == 1) return s; // base case return the same value if the numrows is 1

// 	res = ""

// 	for r in range(numrows){ // loop in through each row
// 		increment = (numrows - 1) * 2;
// 		for(i = 0; i < r; i+= increment){
// 			res += s[i]
// 			if (r > 0 and r < numrows - 1 and 
// 			i + increment - 2 * r < len(s)){
// 			res += s[i + increment - 2 * r]
// 			}
// 		}
// 	}
		