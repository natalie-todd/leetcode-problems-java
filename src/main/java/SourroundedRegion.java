import sun.misc.Queue;

public class SourroundedRegion {

    public static char[][] input = {
            {'X', 'X', 'X', 'X'},
            {'X', 'O', 'O', 'X'},
            {'X', 'X', 'O', 'X'},
            {'X', 'O', 'X', 'X'}
    };

    public static int solveBfs(char[][] board) throws InterruptedException {
        if (board == null || board.length == 0) {
            return 0;
        }
        int nr = board.length;
        int nc = board[0].length;
        for (int r = 0; r < nr; r++) {
            for (int c = 0; c < nc; c++) {
                if ((board[r][c]) == 'O' && (r != 0) && (c != 0) && (r < nr) && (c < nc)) {
                    Queue queue = new Queue();
                    queue.enqueue(r * nc + c);
                    int id = (int) queue.dequeue();
                    int row = id / nc;//r val
                    int col = id % nc;//c val
                    System.out.println("board: " + r + " " + c + " id: " + id + " row: " + row + " col: " + col);
                    if (row - 1 > 0 && board[row - 1][col] == 'O') {
                        queue.enqueue((row - 1) * nc + col);
                        board[row - 1][col] = 'X';
                    }
                    if (row + 1 < nr && board[row + 1][col] == 'O') {
                        queue.enqueue((row + 1) * nc + col);
                        board[row + 1][col] = 'X';
                    }
                    if (col - 1 < 0 && board[row][col - 1] == 'O') {
                        queue.enqueue(row * nc + (col - 1));
                        board[row][col-1] = 'X';
                    }
                    if (col + 1 < nc && board[row][col+1] == 'O') {
                        queue.enqueue(row * nc + (col + 1));
                        board[row][col+1] = 'X';
                    }
                }
            }
        }

        for(int r = 0; r < nr; r++) {
            for(int c = 0; c < nc; c++) {
                System.out.println(board[r][c]);
            }
        }
        return 4;
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println(solveBfs(input));
    }
}
