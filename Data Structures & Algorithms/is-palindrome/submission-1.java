class Solution {
    
    public boolean isPalindrome(String s) {

        String temp = s.replaceAll("[^A-Za-z0-9]","");
        
        int n = temp.length();
        temp = temp.toLowerCase();

        for(int i = 0; i < n/2; i++)
        {
            if(temp.charAt(i) != temp.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
}
