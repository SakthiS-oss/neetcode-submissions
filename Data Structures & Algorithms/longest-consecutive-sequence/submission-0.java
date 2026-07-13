class Solution {
    public int longestConsecutive(int[] nums) {
HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        
        int longestChain = 0;
        
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentChain = 1;
                
                while (set.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentChain += 1;
                }
                
                longestChain = Math.max(longestChain, currentChain);
            }
        }
        
        return longestChain;
}
}
