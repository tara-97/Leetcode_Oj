class Solution {
    public int minimumSize(int[] nums, int maxOperations) {
        int ans = 0;
        int n = nums.length;
        int low = 1;
        int high = 1_000_000_000;
        while(low < high){
            int mid = (low+high)/2;
            int ops = noOfOp(mid,nums);
            if(ops > maxOperations){
                low = mid+1;
            }
            if(ops <= maxOperations){
                high = mid;
            }

        }
        return low;

    }
    public int noOfOp(int i,int[] nums){
        int ops = 0;
        int n = nums.length;
        for(int j=0;j<n;j++){
            if(nums[j] <= i) continue;
            else ops+=(nums[j]-1) / i;
        }
        return ops;
    }
}