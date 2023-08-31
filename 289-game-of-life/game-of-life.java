class Solution {
    int[][] directions = {{0, -1}, {-1, -1}, {-1, 0}, {-1, 1}, {0, 1}, {1, 1}, {1, 0}, {1, -1}};
    
    public void gameOfLife(int[][] board) {
        if (board == null || board.length == 0) return;
        int m = board.length;
        int n = board[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int ones = 0, zeroes = 0;
                for (int[] dir : directions) {
                    int newX = i + dir[0];
                    int newY = j + dir[1]; 

                    if (newX >= 0 && newX < m && newY >= 0 && newY < n) {
                        if (board[newX][newY] == 0 || board[newX][newY] == 2) zeroes++;
                        else if (board[newX][newY] == 1 || board[newX][newY] == -1) ones++;
                    }
                }
                if (board[i][j] == 0) {
                    if (ones == 3) board[i][j] = 2;
                } else if (board[i][j] == 1) {
                    if (ones < 2 || ones > 3) {  
                        board[i][j] = -1;
                    }
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == -1) board[i][j] = 0;
                else if (board[i][j] == 2) {
                    board[i][j] = 1;
                }
            }
        }
    }
}
