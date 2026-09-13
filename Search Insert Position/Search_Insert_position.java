class Solution {
    public int searchInsert(int[] nums, int target) {
      int n = nums.length;
      int start = 0 ;
      int end = n-1;
      int ans =0;
      while(start <= end){
        int mid = (end - start)/2 + start;
        if(target == nums[mid]){
            return mid;
        }
        else if(target > nums[mid]){
            ans = mid+1;
            start = mid+1;
        }
        else{
            end = mid - 1;
        }
      }
      return ans;
    }
}
