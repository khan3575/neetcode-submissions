class Solution {
    public boolean isAnagram(String s, String t) {
        int[] countArray = new int[26];

        for(int i = 0; i< s.length(); i++)
        {
            countArray[s.charAt(i)-'a']++;
        }
        for(int i = 0; i< t.length(); i++)
        {
            countArray[t.charAt(i)-'a']--;
        }
        
        boolean isAnagram = true;
        for(int i = 0; i < 25; i++)
        {
            if(countArray[i] !=0)
            {
                isAnagram=false;
                break;
            }
        }
        return isAnagram;
    }
}
