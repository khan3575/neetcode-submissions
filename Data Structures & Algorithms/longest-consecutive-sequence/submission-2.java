class Solution {
    public int longestConsecutive(int[] nums) {

        if(nums.length==0 || nums == null)
        {
            return 0;
        }
        Set<Integer> numSet = new HashSet<>();
        for(int num : nums)
        {
            numSet.add(num);
        }   

        int longestStrike = 0;
        for(int num : numSet)
        {
            if(!numSet.contains(num-1))
            {
                int currentNum = num;
                int currentStrike = 1;
                while(numSet.contains(currentNum+1)) 
                {
                    currentNum = currentNum+1;
                    currentStrike= currentStrike+1;
                }
                longestStrike = Math.max(currentStrike , longestStrike);
            }
        }
        return longestStrike;
    }
}
