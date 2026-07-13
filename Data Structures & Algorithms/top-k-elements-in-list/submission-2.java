class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hashmap.put(nums[i], hashmap.getOrDefault(nums[i], 0) + 1);
        }
        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(hashmap.entrySet()); 
        entryList.sort(Map.Entry.<Integer, Integer>comparingByValue().reversed());
        int[] result = new int[k];
        for(int i = 0; i < k; i++){
            result[i] = entryList.get(i).getKey();
        }   
        return result;   
    }
}
