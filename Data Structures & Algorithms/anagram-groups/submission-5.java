class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> inputMap = new HashMap<>();
        for(int i = 0; i < strs.length; i++)
        {
        //     String input = strs[i].chars().sorted().mapToObj( c -> String.valueOf((char)c)).collect(Collectors.joining());
            char temp[] = strs[i].toCharArray();
            Arrays.sort(temp);
            String sorted = new String(temp);
            inputMap.computeIfAbsent(sorted, k -> new ArrayList<>()).add(strs[i]);
        }
        List<List<String>> result = new ArrayList<>(inputMap.values());
        return result;

    }
}
