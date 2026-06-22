class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> inputMap = new HashMap<>();
        for(int i = 0; i < strs.length; i++)
        {
            String temp = strs[i];
            String input = temp.chars().sorted().mapToObj( c -> String.valueOf((char)c)).collect(Collectors.joining());
            inputMap.computeIfAbsent(input, k -> new ArrayList<>()).add(strs[i]);
        }
        List<List<String>> result = new ArrayList<>(inputMap.values());
        return result;

    }
}
