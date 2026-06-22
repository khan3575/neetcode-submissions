class Solution {
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums);
        boolean isDuplicate = false;
        for(int i = 0; i< nums.length-1; i++)
        {
            if(nums[i] == nums[i+1])
            {
                isDuplicate= true;
                break;
            }
        }
        return isDuplicate;
    }
}