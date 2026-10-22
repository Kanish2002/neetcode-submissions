class Solution {
    public boolean isValidSudoku(char[][] board) {

        HashSet<Character>[] box = new HashSet[9];
        for(int i = 0; i < box.length;i++) box[i] = new HashSet<Character>();
        for(int i = 0;i<board.length;i++){
        HashSet<Character> rows = new HashSet<Character>();
        HashSet<Character> columns = new HashSet<Character>();
            for(int j = 0;j < board[i].length;j++){
                if(board[i][j]!='.'){
                    if(!rows.add(board[i][j])) return false;
                    int boxIndex = (i / 3) * 3 + (j / 3);
                    if(!box[boxIndex].add(board[i][j])) return false;
                }
                if(board[j][i]!='.'){
                    if(!columns.add(board[j][i])) return false;
                }
            }
        }
    return true;

    }
}
