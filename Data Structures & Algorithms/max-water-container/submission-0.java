class Solution {
    public int maxArea(int[] heights) {
        int totalAmount = 0;
        int left = 0, right = heights.length - 1;

        while(left < right)
        {
            int currentTotalAmount =  Math.min(heights[left],heights[right]) * (right-left);
            totalAmount = Math.max(totalAmount, currentTotalAmount);

            if(heights[left]>heights[right])
            {
                right--;
            }
            else{
                left++;
            }
        }
        return totalAmount;
    }
}
