public class NumberOfIslands {
    public static char[][] theIsland = new char[][]{
            {'1', '1', '1', '1', '0'},
            {'1', '1', '0', '1', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '0', '0', '0'}
    };

    public static char[][] theSecondIsland = new char[][]{
            {'1','1','0','0','0'},
            {'1','1','0','0','0'},
            {'0','0','1','0','0'},
            {'0','0','0','1','1',}};

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

    public static void main(String[] args) {
        System.out.println(dfsFound(theSecondIsland));
    }
}
