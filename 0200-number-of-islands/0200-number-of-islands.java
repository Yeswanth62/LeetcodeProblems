class Solution {
    public int numIslands(char[][] grid) {
        int res=0;
        int[][] visited=new int[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1' && visited[i][j]!=1){
                    res++;
                    dfs(i,j,grid,visited);
                }
            }
        }
        return res;
    }
    public void dfs(int row,int col,char[][] grid,int[][] visited ){
        if(row<0 || row>=grid.length || col<0 || col>=grid[0].length){
            return;
        }
        if(visited[row][col]==1 || grid[row][col]=='0'){
            return;
        }
        visited[row][col]=1;
        dfs(row-1,col,grid,visited);
        dfs(row+1,col,grid,visited);
        dfs(row,col-1,grid,visited);
        dfs(row,col+1,grid,visited);

    }
}