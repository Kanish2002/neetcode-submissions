class Solution {
    public boolean isValidSudoku(char[][] board) {
        LinkedHashMap<Integer,LinkedHashMap<Character,Integer>> rows = new LinkedHashMap<Integer,LinkedHashMap<Character,Integer>>();
        LinkedHashMap<Integer,LinkedHashMap<Character,Integer>> columns = new LinkedHashMap<Integer,LinkedHashMap<Character,Integer>>();


        for(int i = 0;i<board.length;i++){
            for(int j = 0;j < board[i].length;j++){
                if(board[i][j]!='.'){
                    if(!rows.containsKey(i)) rows.put(i,new LinkedHashMap<Character,Integer>());
                    else{
                        if(rows.get(i).containsKey(board[i][j])) return false;
                    }
                    rows.get(i).put(board[i][j],1);
                }
                if(board[j][i]!='.'){
                    if(!columns.containsKey(i)) columns.put(i,new LinkedHashMap<Character,Integer>());
                    else {
                        if(columns.get(i).containsKey(board[j][i])) return false;
                    }
                    columns.get(i).put(board[j][i],1);
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
        System.out.println(rows);
        System.out.println(columns);
    return true;

    }
}
