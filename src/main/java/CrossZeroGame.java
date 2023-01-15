public class CrossZeroGame {
    public static final int SIZE = 5;
    public static final char EMPTY = '-';
    public static final char CROSS = 'X';
    public static final char ZERO = 'O';

    public static void main(String[] args) {
        char[][] field1 = {
                {ZERO, ZERO, ZERO, EMPTY, EMPTY},
                {CROSS, CROSS, CROSS, CROSS, CROSS},
                {CROSS, ZERO, CROSS, ZERO, CROSS},
                {ZERO, ZERO, EMPTY, ZERO, CROSS},
                {ZERO, EMPTY, ZERO, CROSS, CROSS}
        };
        printResult(field1);
        char[][] field2 = {
                {CROSS, ZERO, CROSS, ZERO, CROSS},
                {ZERO, CROSS, ZERO, CROSS, ZERO},
                {EMPTY, EMPTY, CROSS, EMPTY, EMPTY},
                {EMPTY, EMPTY, EMPTY, EMPTY, EMPTY},
                {EMPTY, EMPTY, EMPTY, EMPTY, EMPTY}
        };
        printResult(field2);
        char[][] field3 = {
                {CROSS, ZERO, EMPTY, EMPTY, EMPTY},
                {EMPTY, CROSS, ZERO, EMPTY, EMPTY},
                {CROSS, EMPTY, CROSS, ZERO, EMPTY},
                {ZERO, ZERO, EMPTY, CROSS, EMPTY},
                {ZERO, EMPTY, EMPTY, CROSS, CROSS}
        };
        printResult(field3);
        char[][] field4 = {
                {ZERO, ZERO, ZERO, ZERO, ZERO},
                {CROSS, CROSS, EMPTY, EMPTY, EMPTY},
                {CROSS, EMPTY, CROSS, CROSS, CROSS},
                {ZERO, EMPTY, EMPTY, EMPTY, CROSS},
                {ZERO, EMPTY, EMPTY, EMPTY, EMPTY}
        };
        printResult(field4);
    }

    public static void printResult(char[][] result) {
        printField(result);
        System.out.println(isWin(result, CROSS) ? "ПОБЕДИЛИ КРЕСТИКИ" : (isWin(result, ZERO) ? "ПОБЕДИЛИ НОЛИКИ" : "НИКТО НЕ ПОБЕДИЛ"));
        System.out.println();
    }

    public static boolean isWin(char[][] field, char player) {
        int playerNum;
        for (int i = 0; i < SIZE; i++) {
            playerNum = 0;
            for (int j = 0; j < SIZE; j++) {
                if (field[i][j] == player) {
                    playerNum++;
                }
            }
            if (playerNum == SIZE) {
                return true;
            }
        }
        for (int i = 0; i < SIZE; i++) {
            playerNum = 0;
            for (int j = 0; j < SIZE; j++) {
                if (field[j][i] == player) {
                    playerNum++;
                }
            }
            if (playerNum == SIZE) {
                return true;
            }
        }
        playerNum = 0;
        for (int i = 0; i < SIZE; i++) {
            if (field[i][i] == player) {
                playerNum++;
            }
        }
        if (playerNum == SIZE) {
            return true;
        }
        playerNum = 0;
        for (int i = 0; i < SIZE; i++) {
            if (field[SIZE - i - 1][i] == player) {
                playerNum++;
            }
        }
        if (playerNum == SIZE) {
            return true;
        }
        return false;
    }

    public static void printField(char[][] field) {
        for (char[] row : field) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}


