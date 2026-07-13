
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> h1 = new HashMap<>();
        HashMap<Character, Integer> h2 = new HashMap<>();

        // Build frequency map for string s
        for (char c : s.toCharArray()) {
            h1.put(c, h1.getOrDefault(c, 0) + 1);
        }

        // Build frequency map for string t
        for (char c : t.toCharArray()) {
            h2.put(c, h2.getOrDefault(c, 0) + 1);
        }

        // Compare the two maps
        return h1.equals(h2);
    }
}