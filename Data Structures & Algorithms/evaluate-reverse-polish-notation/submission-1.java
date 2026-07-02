class Solution {
    int eval(int a, int b, String s)
    {
        if(s.equals("+"))
        {
            return a + b;
        }
       else if(s.equals("-"))
        {
            return a - b;
        }
        else if(s.equals("*"))
        {
            return a * b;
        }
        else
        {
            return a / b;
        }
    }

    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(String s: tokens)
        {
            if(s.equals("+") || s.equals("-") ||s.equals("*")||s.equals("/"))
            {
                int b = st.pop();
                int a = st.pop();
                int result = eval(a,b, s);
                st.push(result);
            }
            else{
                st.push(Integer.parseInt(s));
            }
        }
        return st.pop();
    }
}
