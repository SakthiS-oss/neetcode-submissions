class Solution {
    public int maxArea(int[] heights) {
        int res = 0;
        for(int i = 0; i < heights.length; i++){
            for(int j = 0; j < heights.length; j++){
                int height = Math.min(heights[i], heights[j]);
                int width = (j-i);
                res = Math.max(res, height * width);
            }
        }
        return res;
    }
}
