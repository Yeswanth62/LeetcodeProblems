class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(find(i,j,0,board,word)){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean find (int i,int j,int k ,char[][] board,String word){
        if(k==word.length()){
            return true;
        }
        if(i<0 || j<0 || i>=board.length || j>=board[0].length || board[i][j] !=word.charAt(k))
        {
            return false;
        }
        char ch=board[i][j];
        board[i][j]='.';
        boolean found=(find(i-1,j,k+1,board,word) || 
                       find(i,j+1,k+1,board,word) ||
                       find(i+1,j,k+1,board,word) ||
                       find(i,j-1,k+1,board,word)  );
                    board[i][j]=ch;
                    return found;
    } 
}