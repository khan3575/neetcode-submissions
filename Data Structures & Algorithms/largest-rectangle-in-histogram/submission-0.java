class Solution {
    static int[] nextSmaller(int[] arr)
    {
        int n = arr.length;
        int[] nextSmall = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < n; i++)
        {
            nextSmall[i] = n;
        }
        for(int i = 0; i < n; i++)
        {
            while(!st.empty() && arr[i]< arr[st.peek()])
            {
                nextSmall[st.pop()] = i;
            }
            st.push(i);
        }
        return nextSmall;
    }
    static int[] prevSmaller(int[] arr)
    {
        int n = arr.length;
        int[] prevSmall = new int[n];
        for(int i = 0; i < n; i++)
        {
            prevSmall[i] = -1;
        }
        Stack<Integer> st = new Stack<>();
        for(int i = n-1; i >= 0; i--)
        {
            while(!st.empty() && arr[i]<arr[st.peek()])
            {
                prevSmall[st.pop()] = i;
            }
            st.push(i);
        }
        return prevSmall;
    }
    public int largestRectangleArea(int[] heights) {
        int[] prevSmall = prevSmaller(heights);
        int[] nextSmall = nextSmaller(heights);
        int maxArea = 0;
        int n = heights.length;
        for(int i = 0; i< n; i++)
        {
            int area = heights[i] * ( nextSmall[i]- prevSmall[i]-1);
            maxArea = Math.max(area, maxArea);
        }
        return maxArea;
    }
}
