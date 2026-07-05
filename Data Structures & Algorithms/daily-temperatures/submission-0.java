class Solution {
    public record Pair<K, V> (K key, V value) {};

    public int[] dailyTemperatures(int[] temperatures) {

        Stack< Pair<Integer,Integer> > st = new Stack<>();
        int[] ans = new int[temperatures.length];
        for(int i = 0; i < temperatures.length; i++)
        {
            int idx = i+1;
            if(st.isEmpty())
            {
                st.push(new Pair(temperatures[i], idx));
            }
            else{
                while(!st.isEmpty() && st.peek().key() < temperatures[i])
                {
                    int key = st.peek().key();
                    int value = st.peek().value();
                    int val = idx- value;
                    ans[value-1] = val;
                    st.pop();
                }
                st.push(new Pair(temperatures[i], idx));
            }
        }
        return ans;
    }
}
