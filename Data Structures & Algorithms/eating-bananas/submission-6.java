class Solution {
    boolean isOk(int[] piles, int n,long x, int h)
    {
        long time = 0;
        for(int i = 0; i < n; i++)
        {
            if(piles[i]<=x)
            {
                time++;
            }
            else{
                time = time + ((piles[i]+x-1)/x);
            }
        }
        return time <= h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int n = piles.length;
        long left = 1, right = 0;
        for (int pile : piles) {
            right = Math.max(right, pile);
        }
        while(left <= right)
        {
            long mid = left + ((right-left) / 2);
            if(isOk(piles, n, mid, h))
            {
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        return (int)left;
    }
}
