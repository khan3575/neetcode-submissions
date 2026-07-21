class Solution {
    public int largestRectangleArea(int[] heights) {
        if(heights == null || heights.length==0)
        {
            return 0;
        }
        int n = heights.length;

        Stack<Integer> st = new Stack<>();
        int maxArea = 0;

        for(int i = 0; i <= n; i++)
        {
            int currentHeight = (i==n) ? 0 : heights[i];

            while(!st.empty() && currentHeight< heights[st.peek()])
            {
                int height = heights[st.pop()];
                int right = i;
                int left = (st.isEmpty())? -1 : st.peek();

                int area = height * (right-left-1);
                maxArea = Math.max(maxArea, area);
            }
            st.push(i);
        }
        return maxArea;
    }
}
