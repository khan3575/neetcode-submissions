class Solution {
    public int trap(int[] height) {
        int result = 0;
        int n = height.length;

        //defining prefix, suffix array
        int[] prefixMax = new int[n + 2];
        int[] suffixMax = new int[n + 2];

        //initial value;
        prefixMax[0] = 0;
        suffixMax[n+1] = 0;
        

        for(int i = 1; i <=n; i++)
        {
            prefixMax[i] = Math.max(prefixMax[i-1],height[i-1]);

            suffixMax[n+1-i] = Math.max(suffixMax[n+2-i], height[n-i]);
        }

        for(int i = 0; i < n; i++)
        {
            result += Math.min(prefixMax[i+1], suffixMax[i+1])- height[i];
        }
        return result;




    }
}
