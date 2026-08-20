class Solution {
    private int[] map;
    private boolean checkRow(char[][] board, int r, int c) {
        char ch=board[r][c];
        for (int i = 0; i < 9; i++) {
            if(board[r][i]=='.'||i==c) continue;
            map[board[r][i]-'1']++; 
        }
        if(map[ch-'1']>1)  return false;

        return true;
    }

    private boolean checkCol(char[][] board, int r, int c) {
        char ch=board[r][c];
        for (int i = 0; i < 9; i++) {
            if(board[i][c]=='.'||i==r) continue;
            map[board[i][c]-'1']++; 
        }
        if(map[ch-'1']>1)  return false;
        return true;
    }

    private boolean checkBlock(char[][] board, int r, int c){
        char ch=board[r][c];
        int rr=(r/3)*3;
        int cc=(c/3)*3;

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(board[i+rr][j+cc]=='.'||
                    (i+rr==r && j+cc==c)) continue;
                map[board[i+rr][j+cc]-'1']++;
            }
        }
        if(map[ch-'1']>1)  return false;

        return true;
    }

    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.') continue;

                map= new int[10];
                map[board[i][j]-'1']++;
                if(!checkRow(board, i,j) || !checkCol(board, i,j)
                   || !checkBlock(board, i,j)) return false;
            }
        }
        return true;
    }
}
