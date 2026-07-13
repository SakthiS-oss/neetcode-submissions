class Solution {
    public int search(int[] nums, int target) {
        int right = nums.length - 1;
        int left = 0;
        while(right >= left){
            int mid = (right + left) / 2;
            if(nums[mid] == target){return mid;}
            if(target > nums[mid]){left = mid + 1;}
            if(target < nums[mid]){right = mid - 1;}
        }
        return -1;
    }
}
