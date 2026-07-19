class Solution {
    public int largestRectangleArea(int[] heights) {
        
        int n = heights.length;
        if(n==0)
        {
            return 0;
        }
        if(n==1)
        {
            return heights[0];
        }
    
        Stack<Integer> st = new Stack<>();
        int maxArea = 0;

        for(int i = 0; i <= n; i++)
        {
            int curHeight = (i == n) ? 0 : heights[i];

            while(!st.empty() && curHeight < heights[st.peek()])
            {
                int height = heights[st.pop()];
                int right = i;
                int left = st.isEmpty() ? -1 : st.peek();
                
                int area = height *(right - left -1);
                maxArea = Math.max(area, maxArea);
            }
            st.push(i);
        }
        return maxArea;
    }
}
