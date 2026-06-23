class Solution {
    public int[] productExceptSelf(int[] nums) {
        long result = 1;
        int foundZero = 0;
        List<Integer> zeroIdx = new ArrayList<>();
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i]==0)
            {
                foundZero++;
                zeroIdx.add(i);
            }
            result *= nums[i];
        }
        int[] resultArray = new int[nums.length];
        if(foundZero==0)
        {
            for(int i = 0; i < nums.length; i++)
            {
                resultArray[i] = (int) (result/ nums[i]);
            }
        }
        else if(foundZero == 1)
        {
            int val = 1;
            for(int i = 0; i < nums.length; i++)
            {
                
                if(i == zeroIdx.get(0))
                {
                    continue;
                }
                val *= nums[i];
                resultArray[i] = 0;
            }
            resultArray[ zeroIdx.get(0) ] = val;

        }
        else{
            for(int i = 0; i < nums.length; i++)
            {
                resultArray[i]= 0;
            }
        }
        return resultArray;
    }
}  
