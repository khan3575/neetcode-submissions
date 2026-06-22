class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        // building the frequency map
        for(int i = 0; i < nums.length; i++)
        {
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        } 

        // Initializing priority queue
        // want to use the frequnce to sort the priority queue;

        PriorityQueue<Integer> queue = new PriorityQueue<>(
            Comparator.comparingInt(map::get)
        );

        for( int n : map.keySet())
        {
            queue.add(n);
            if(queue.size() > k)
            {
                queue.poll();
            }
        }

        int[] top = new int[k];
        for(int i = k-1; i>=0; i--)
        {   
            top[i] = queue.poll();
        } 
        return top;
        

    }
}
