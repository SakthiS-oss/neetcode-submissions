class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> hashmap = new HashMap<>();
        if(s.length() != t.length()){return false;}
        for(int i = 0; i < s.length(); i++){
            char temp = s.charAt(i);
            if(hashmap.containsKey(temp)){
                hashmap.put(temp, hashmap.get(temp) + 1);
            } else {
                hashmap.put(temp, 1);
            }
        }
        for(int j = 0; j < t.length(); j++){
            char temp = t.charAt(j);
            if(!hashmap.containsKey(temp)){ return false;}
            hashmap.put(temp, hashmap.get(temp) - 1);
        }
        for(int k = 0; k < t.length(); k++){
            if(hashmap.get(t.charAt(k)) != 0){ return false;}
        }
        return true;
    }
}
