class Solution {
    public boolean isValidSudoku(char[][] board) {


        for(int i = 0;i<board.length;i++){
        LinkedHashMap<Character,Integer> rows = new LinkedHashMap<Character,Integer>();
        LinkedHashMap<Character,Integer> columns = new LinkedHashMap<Character,Integer>();
            for(int j = 0;j < board[i].length;j++){
                if(board[i][j]!='.'){
                    if(rows.containsKey(board[i][j])) return false;
                    rows.put(board[i][j],1);
                }
                if(board[j][i]!='.'){
                    if(columns.containsKey(board[j][i])) return false;
                    columns.put(board[j][i],1);
                }
                if(i%3 == 2 && j%3== 2){
                    LinkedHashMap<Character,Integer> threeByThree = new LinkedHashMap<Character,Integer>();
                    for(int m = i-2;m <= i;m++){
                        for(int n = j-2;n <= j;n++){
                            if(board[m][n] != '.')
                            if(threeByThree.containsKey(board[m][n])) return false;
                            else threeByThree.put(board[m][n],1);
                        }
                    }
                }
            }
        }
    return true;

    }
}
