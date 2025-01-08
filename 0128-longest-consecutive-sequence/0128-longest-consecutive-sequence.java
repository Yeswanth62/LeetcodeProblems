class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
      int n=nums.length;
      if(n==0){
        return 0;
      }
      int ls=Integer.MIN_VALUE;
      int cnt=0;
      int lcs=1;
      for(int i=0;i<n;i++){
        if(nums[i]-1==ls){
            cnt++;
            ls=nums[i];
        }
        else if(nums[i]!=ls){
            cnt=1;
            ls=nums[i];
        }
         lcs=Math.max(lcs,cnt);
      }
       return lcs;
    }
}