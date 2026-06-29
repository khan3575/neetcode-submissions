class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //sorting the array
        Arrays.sort(nums);
        int target = 0;
        List<List<Integer>> res = new ArrayList<>();
        for(int i = 0; i < nums.length-2; i++)
        {
            //fixing first number;
            if(i>0 && nums[i-1]== nums[i])
            {
                continue;
            }
            int left = i + 1, right = nums.length - 1;
            while (left < right)
            {
                int currentSum = nums[i] + nums[left] + nums[right];
                if(currentSum == target)
                {
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    while(left < right && nums[left]== nums[left+1])
                    {
                        left++;
                    }
                    while(left < right && nums[right] == nums[right-1])
                    {
                        right--;
                    }
                    left++;
                    right--;
                }
                else if(currentSum < target)
                {
                    left++;
                }
                else{
                    right--;
                }
            }
        }

        return res;
    }
}
