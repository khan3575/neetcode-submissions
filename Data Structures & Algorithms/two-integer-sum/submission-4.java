class Solution {
    record Pair (int first, int second) {}

    public int[] twoSum(int[] nums, int target) {
        Pair[] array = new Pair[nums.length];
        for(int i = 0; i < nums.length; i++)
        {
            array[i] = new Pair(nums[i], i); 
        }
        Arrays.sort(array, Comparator.comparingInt(Pair::first));
        int left = 0, right = array.length-1;

        while(left < right)
        {
            int sum = array[left].first() + array[right].first();
            if(sum > target)
            {
                right--;
            }
            else if(sum < target)
            {
                left++;
            }
            else{
                break;
            }
        }
        int[] result = new int[2];
        result[0]= array[left].second();
        result[1]= array[right].second();
        Arrays.sort(result);
        return result;
    }
}
