class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String s : strs){
            char[] temp = s.toCharArray();
            Arrays.sort(temp);
            String keys = new String(temp);
            if(!map.containsKey(keys)){
                map.put(keys, new ArrayList<String>());
            }
            map.get(keys).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
