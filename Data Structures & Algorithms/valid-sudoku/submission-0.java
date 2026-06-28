class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> seen = new HashSet<String>();

        for(int row = 0; row < 9; row++)
        {
            for(int col = 0; col < 9; col++)
            {
                Character currentKey = board[row][col];
                // ignoring the '.' 
                if(currentKey != '.')
                {
                    // same number found in a row
                    String rowKey = currentKey + "in row "+ row;
                    // same number found in a column
                    String colKey = currentKey + "in col" + col;

                    // same number found in a box?
                    String boxKey = currentKey + "in box" + (row/3) + "-" + (col/3);

                    if(!seen.add(rowKey) || !seen.add(colKey) || !seen.add(boxKey))
                    {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
