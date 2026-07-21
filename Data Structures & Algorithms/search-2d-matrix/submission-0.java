class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int n = rows * cols;

        int left = 0, right = n - 1;
        boolean found = false;
        while(left <= right)
        {
            int mid = (left + right) / 2;
            int ll = mid/cols;
            int rr = mid%cols;
            if(matrix[ll][rr] == target)
            {
                found = true;
                break;
            }
            else if(matrix[ll][rr] > target)
            {
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        return found;
    }
}
