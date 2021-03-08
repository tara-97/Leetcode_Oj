class Solution {
    public int minElements(int[] nums, int limit, int goal) {
        long sum = 0;
        for(long num:nums){
            sum+=num;
        }
        long required = Math.abs(goal - sum);
        long ans= 0;
        ans+=(required/limit);
        if(required % limit>0) ans++;
        return (int)ans;

    }
}