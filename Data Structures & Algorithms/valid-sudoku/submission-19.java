class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>[] rows = new HashSet[9];
        HashSet<Character>[] cols = new HashSet[9];
        HashSet<Character>[][] box = new HashSet[3][3];

        for(int i = 0; i < 9; i++){
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
        }

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                box[i][j] = new HashSet<>();
            }
        }

        for(int i = 0;i<board.length;i++){
            for(int j = 0;j < board[i].length;j++){
                char val = board[i][j];
                if(val =='.'){ 
                    continue;
                }
                if(!rows[i].add(val) || !cols[j].add(val) || !box[i/3][j/3].add(val)) return false;                
            }
        }
    return true;

    }
}
