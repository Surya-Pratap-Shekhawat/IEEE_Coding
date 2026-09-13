class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int len = nums.length;
        int last_ind = len - k;
        int temp = k;
        float max_avg = Integer.MIN_VALUE;
        float sum =0;
        int check =0;
        int i;
        while(check+k <= len){
            for(i=check ; i < temp; i++){
                sum+= nums[i];
            }
            check++;
            temp++;
            if((sum/k) > max_avg){
                max_avg = sum/k;
            }
            sum = 0;
        }
        return max_avg;
    }
}
