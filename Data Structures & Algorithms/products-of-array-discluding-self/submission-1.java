class Solution {
    public int[] productExceptSelf(int[] nums) {
        // suffix and prefix approach
        int n = nums.length;
        int[] suffix = new int[n + 2];
        int[] prefix = new int[n + 1];

        // Prefix Calculation O(n)
        prefix[0]= 1;
        for(int i = 0; i< n; i++)
        {
            prefix[i+1]= prefix[i] * nums[i];
        }

        // Suffix Calculation O(n)

        suffix[n+1] = 1;
        for(int i = n ; i> 0; i--)
        {
            suffix[i] = suffix[i+1] * nums[i-1];
        }

        int[] result = new int[n];
        for(int i = 0; i < n; i++)
        {
            result[i] = prefix[i] * suffix[i+2];
        }
        return result;
    }
}  
