class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hashmap = new HashMap<>();
        for(String s : strs){
            char[] temp = s.toCharArray();
            Arrays.sort(temp);
            String key = new String(temp);
            if(!hashmap.containsKey(key)){
                hashmap.put(key, new ArrayList<String>());
            }
            hashmap.get(key).add(s);
        }
        return new ArrayList<>(hashmap.values());
    }
}
