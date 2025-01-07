class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int maxpro=0;
        int minprice=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
         minprice=Math.min(prices[i],minprice);
         maxpro=Math.max(maxpro,prices[i]-minprice);
        }
        return maxpro;
    }
}