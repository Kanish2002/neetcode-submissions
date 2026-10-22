class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character> rows = new HashSet<Character>();
        HashSet<Character> columns = new HashSet<Character>();
        HashSet<Character>[] box = new HashSet[9];

        for(int i = 0; i < box.length;i++) box[i] = new HashSet<Character>();
        for(int i = 0;i<board.length;i++){
            rows.clear();
            columns.clear();
            for(int j = 0;j < board[i].length;j++){
                char r = board[i][j];
                char c = board[j][i];
                if(r !='.'){
                    if(!rows.add(r)) return false;
                    int boxIndex = (i / 3) * 3 + (j / 3);
                    if(!box[boxIndex].add(r)) return false;
                }
                if(c !='.'){
                    if(!columns.add(c)) return false;
                }
            }
        }
    return true;

    }
}
