class Solution {
    public boolean isValidSudoku(char[][] board) {


        for(int i = 0;i<board.length;i++){
        HashSet<Character> rows = new HashSet<Character>();
        HashSet<Character> columns = new HashSet<Character>();
            for(int j = 0;j < board[i].length;j++){
                if(board[i][j]!='.'){
                    if(rows.contains(board[i][j])) return false;
                    rows.add(board[i][j]);
                }
                if(board[j][i]!='.'){
                    if(columns.contains(board[j][i])) return false;
                    columns.add(board[j][i]);
                }
                if(i%3 == 2 && j%3== 2){
                    HashSet<Character> box = new HashSet<Character>();
                    for(int m = i-2;m <= i;m++){
                        for(int n = j-2;n <= j;n++){
                            if(board[m][n] != '.')
                            if(box.contains(board[m][n])) return false;
                            else box.add(board[m][n]);
                        }
                    }
                }
            }
        }
    return true;

    }
}
