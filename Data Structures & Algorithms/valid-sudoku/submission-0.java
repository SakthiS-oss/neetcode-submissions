class Solution {
    public boolean isValidSudoku(char[][] board) {
       HashSet<String> h = new HashSet<>();
       for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char currentVal = board[i][j]; 
                if (currentVal != '.') {
                String row = currentVal + "row" + i;
                String col = currentVal + "col" + j;
                String box = currentVal + "box" + (i / 3) + "-" + (j / 3);
                if(!h.add(row) || !h.add(col) || !h.add(box)){
                    return false;
                }
        
            }
            }
       }
       return true;
    }
}
