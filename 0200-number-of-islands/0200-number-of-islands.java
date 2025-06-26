class pair {
    int r; 
    int c;
    public pair(int r, int c) {
        this.r = r;
        this.c = c;
    }
}
class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        boolean [][]vis = new boolean[m][n];
        int count = 0; //number of islands

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j]=='1' && vis[i][j]==false) {
                    bfs(i, j,grid,vis,m ,n);
                    count++;
                }
                
            }
        }
        return count;
        
    }
    public void bfs(int i, int j, char[][] grid, boolean[][] vis,int rowL, int colL) {
        vis[i][j] = true;
        Queue<pair>q = new LinkedList<>();
        q.add(new pair(i,j));
        int[] d_r = {1,0,0,-1};
        int[] d_c = {0,-1,1,0};
        while(!q.isEmpty()) {
            pair p = q.poll();
            int row = p.r;
            int col = p.c;
            for(int k = 0; k < 4; k++) {
                int nRow = row + d_r[k];
                int nCol = col + d_c[k];
                if(nRow >= 0 && nRow < rowL && nCol >= 0 && nCol < colL 
                && grid[nRow][nCol] == '1' && vis[nRow][nCol]==false){
                    vis[nRow][nCol] = true;
                    q.add(new pair(nRow,nCol));
                }


            }

        }
    }
}