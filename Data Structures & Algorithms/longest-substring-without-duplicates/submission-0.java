class Solution {
    public int lengthOfLongestSubstring(String s) {
        int longChain = 0;
        for(int i = 0; i < s.length(); i++){
            HashSet<Character> seen = new HashSet<>();
            char temp1 = s.charAt(i);
            for(int j = i; j < s.length(); j++ ){
                if(seen.contains(s.charAt(j))){
                    break;
                }
                seen.add(s.charAt(j));
            }
            longChain = Math.max(longChain, seen.size());
        }
        return longChain;
    }
}
