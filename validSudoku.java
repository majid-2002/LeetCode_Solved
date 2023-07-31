
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class validSudoku {

    public static boolean isValidSudoku(char[][] board) {
        Map<Integer, Set<Character>> cols = new HashMap<>(); // col index, set of chars in that col
        Map<Integer, Set<Character>> rows = new HashMap<>(); // row index, set of chars in that row
        Map<Integer, Set<Character>> box = new HashMap<>(); // box index, set of chars in that box

        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                if (board[r][c] == '.') {
                    continue;
                }
                if (rows.containsKey(r) && rows.get(r).contains(board[r][c])
                        || cols.containsKey(c) && cols.get(c).contains(board[r][c])) {
                    return false;
                }

                if (box.containsKey(r / 3 * 3 + c / 3) && box.get(r / 3 * 3 + c / 3).contains(board[r][c])) {
                    return false;
                }

                cols.putIfAbsent(c, new HashSet<>());
                cols.get(c).add(board[r][c]);

                rows.putIfAbsent(r, new HashSet<>());
                rows.get(r).add(board[r][c]);

                box.putIfAbsent(r / 3 * 3 + c / 3, new HashSet<>());
                box.get(r / 3 * 3 + c / 3).add(board[r][c]);

            }
        }

        return true;

    }

    public static void main(String[] args) {
        char[][] board = { { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
                { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
                { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
                { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
                { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
                { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
                { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
                { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
                { '.', '.', '.', '.', '8', '.', '.', '7', '9' } };
        System.out.println(isValidSudoku(board));

    }
}

// box[0][0] box[0][1] box[0][2] | box[0][3] box[0][4] box[0][5] | box[0][6]
// box[0][7] box[0][8]
// box[1][0] box[1][1] box[1][2] | box[1][3] box[1][4] box[1][5] | box[1][6]
// box[1][7] box[1][8]
// box[2][0] box[2][1] box[2][2] | box[2][3] box[2][4] box[2][5] | box[2][6]
// box[2][7] box[2][8]
// ---------------------------------+-----------------------------------+-------------------------------------
// box[3][0] box[3][1] box[3][2] | box[3][3] box[3][4] box[3][5] | box[3][6]
// box[3][7] box[3][8]
// box[4][0] box[4][1] box[4][2] | box[4][3] box[4][4] box[4][5] | box[4][6]
// box[4][7] box[4][8]
// box[5][0] box[5][1] box[5][2] | box[5][3] box[5][4] box[5][5] | box[5][6]
// box[5][7] box[5][8]
// ---------------------------------+-----------------------------------+-------------------------------------
// box[6][0] box[6][1] box[6][2] | box[6][3] box[6][4] box[6][5] | box[6][6]
// box[6][7] box[6][8]
// box[7][0] box[7][1] box[7][2] | box[7][3] box[7][4] box[7][5] | box[7][6]
// box[7][7] box[7][8]
// box[8][0] box[8][1] box[8][2] | box[8][3] box[8][4] box[8][5] | box[8][6]
// box[8][7] box[8][8]
