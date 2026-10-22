class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>[] rows = new HashSet[9];
        HashSet<Character>[] cols = new HashSet[9];
        HashSet<Character>[] box = new HashSet[9];

        for(int i = 0; i < 9;i++){
            box[i] = new HashSet<Character>();
            rows[i] = new HashSet<Character>();
            cols[i] = new HashSet<Character>();
        }

        for(int i = 0;i<board.length;i++){
            for(int j = 0;j < board[i].length;j++){
                char val = board[i][j];
                if(val =='.'){ 
                    continue;
                }
                int boxIndex = (i / 3) * 3 + (j / 3);
                if(!rows[i].add(val) || !cols[j].add(val) || !box[boxIndex].add(val)) return false;                
            }
        }
    return true;

    }
}
