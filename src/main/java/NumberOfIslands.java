import sun.misc.Queue;

import java.util.LinkedList;

public class NumberOfIslands {
    public static char[][] theIsland = new char[][]{
            {'1', '1', '1', '1', '0'},
            {'1', '1', '0', '1', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '0', '0', '0'}
    };

    public static char[][] theSecondIsland = new char[][]{
            {'1', '1', '0', '0', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '1', '0', '0'},
            {'0', '0', '0', '1', '1',}};

    //OG Solution
    public static int numIslands(char[][] grid) {
        int counter = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if ((counter == 0) && (grid[i][j] == 1)) {
                    counter++;
                } else if ((((j != 0) && (grid[i][j - 1] == 0)) && (i != 0) && (grid[i - 1][j] == 0)) && (grid[i][j] == 1)) {
                    counter++;
                }
            }
        }
        return counter;
    }
    //dfs solution

    public static void dfs(char[][] grid, int r, int c) {

        int nr = grid.length;
        int nc = grid[0].length;

        if (r < 0 || c < 0 || r >= nr || c >= nc || grid[r][c] == '0') {
            return;
        }
        System.out.println("<=====" + r + c + "=======>");
        grid[r][c] = '0';
        dfs(grid, r - 1, c);
        dfs(grid, r + 1, c);
        dfs(grid, r, c - 1);
        dfs(grid, r, c + 1);
    }

    public static int dfsFound(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }

        int nr = grid.length;
        int nc = grid[0].length;
        int landCounter = 0;

        for (int r = 0; r < nr; r++) {
            for (int c = 0; c < nc; c++) {
                if (grid[r][c] == '1') {
                    landCounter++;
                    dfs(grid, r, c);
                }
            }
        }
        return landCounter;
    }

    public static int bfs(char[][] grid) throws InterruptedException {
        if (grid == null || grid.length == 0) {
            return 0;
        }

        int nr = grid.length;
        int nc = grid[0].length;
        int counter = 0;

        for (int r = 0; r < nr; r++) {
            for (int c = 0; c < nc; c++) {
                if (grid[r][c] == '1') {
                    counter++;
                    grid[r][c] = '0';

                    Queue neighbors = new Queue();
                    neighbors.enqueue(r * nc + c);

                    while (!neighbors.isEmpty()) {
                        int id = (int) neighbors.dequeue();
                        int row = id / nc;
                        int col = id % nc;

                        if (row - 1 >= 0 && grid[row - 1][col] == '1') {
                            neighbors.enqueue((row - 1) * nc + c);
                            grid[row - 1][col] = '0';
                        }
                        if (row + 1 <= nr && grid[row + 1][col] == '1') {
                            neighbors.enqueue((row+1) * nc + col);
                            grid[row+1][col] = '0';
                        }
                        if (col -1 >= 0 && grid[row][col-1] == '1') {
                            neighbors.enqueue((row) * nc + col-1);
                            grid[row][col-1] = '0';
                        }
                        if (col + 1 <= nc && grid[row][col +1] == '1') {
                            neighbors.enqueue(row * nc + (col +1));
                            grid[row][col+1] = '0';
                        }
                    }
                }
            }
        }
        return counter;
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println(bfs(theIsland));
    }
}
