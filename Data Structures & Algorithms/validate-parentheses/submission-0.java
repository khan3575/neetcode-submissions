class Solution {
    boolean checkChar(Character top, Character ter)
    {
        if((top == '(' && ter ==')')
        || (top == '{' && ter =='}') 
        ||(top == '[' && ter ==']'))
        {
            return true;
        }
        return false;
    }
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        char[] array = s.toCharArray();
        for(Character ch : array)
        {
            if(st.isEmpty())
            {
                st.push(ch);
            }
            else{
                if(checkChar(st.peek(), ch))
                {
                    st.pop();
                }
                else{
                    st.push(ch);
                }
            }
        }
        return st.isEmpty();
    }
}
