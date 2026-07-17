class Solution {
    public int maxProfit(int[] prices) {
        int minP = prices[0];
        int maxP = 0;
        for(Integer i : prices){
            maxP = Math.max(maxP, i - minP);
            minP = Math.min(minP, i);
        }
        return maxP;
    }
}
