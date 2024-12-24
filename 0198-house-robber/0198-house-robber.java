class Solution {
  int[] dp;
  public int rob(int[] nums){
    dp=new int[nums.length];
    Arrays.fill(dp,-1);
    return rec(nums,0);
  
    }
    public int rec(int[] nums,int n){
      if(n>=nums.length) return 0;
      if(dp[n]!=-1)return dp[n];
      int pick=nums[n]+rec(nums,n+2);
      int notpick=rec(nums,n+1);
      return dp[n]=Math.max(pick,notpick);
    }
}