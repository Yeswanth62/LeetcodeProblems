class Solution {
    int[] dp;
    public int minCostClimbingStairs(int[] cost) {
        dp=new int[cost.length];
        Arrays.fill(dp,-1);
        return Math.min(rec(cost,0),rec(cost,1));
    }
    public int rec(int[] cost,int n){
        if(n==cost.length-1 || n==cost.length-2)return cost[n];
        if(dp[n]!=-1)return dp[n];
        return dp[n]=cost[n]+Math.min(rec(cost,n+1),rec(cost,n+2));
    }
}