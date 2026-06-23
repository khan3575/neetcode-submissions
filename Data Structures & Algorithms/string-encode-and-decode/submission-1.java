class Solution {

    private String pattern = "##1##";
    public String encode(List<String> strs) {
        String encoded = "";
        int forwardShift = 5;
        for (int i = 0; i < strs.size(); i++) {
            int n = strs.get(i).length();
            String forwarded = strs.get(i).chars().mapToObj(c ->
             {
                int shiftedValue = (c + forwardShift)%256;
                return String.valueOf((char) shiftedValue);
             }
             ).collect(Collectors.joining());
             encoded += forwarded;
             encoded += pattern;
        }

        return encoded;
    }

    public List<String> decode(String str) {

        String[] parts = str.split(pattern,-1);
        List<String> devided = Arrays.asList(parts);
        List<String> result = new ArrayList<>();
        for(int i = 0; i < devided.size()-1; i++)
        {
            String temp = devided.get(i);
            String revertedString = temp.chars().mapToObj(c ->
                {
                    int shiftBackward = 5;
                    int shiftedValue = ( c- shiftBackward +256)%256;
                    return String.valueOf((char) shiftedValue);
                }
            ).collect(Collectors.joining());
            result.add(revertedString);
        }
       
        return result;
    }
}
