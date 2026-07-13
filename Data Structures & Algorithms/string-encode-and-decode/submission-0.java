

class Solution {

    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            // Append length + delimiter + string
            sb.append(str.length()).append('#').append(str);
        }
        return sb.toString();
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;
        
        while (i < str.length()) {
            // 1. Find where the current length segment ends
            int delimiterIdx = str.indexOf('#', i);
            
            // 2. Parse the length of the next string
            int length = Integer.parseInt(str.substring(i, delimiterIdx));
            
            // 3. Move pointer past the '#' character
            i = delimiterIdx + 1;
            
            // 4. Extract the actual string using the parsed length
            String actualString = str.substring(i, i + length);
            result.add(actualString);
            
            // 5. Move pointer to the start of the next encoded block
            i += length;
        }
        
        return result;
    }
}