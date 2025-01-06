class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length;
        int cnt=0;
        int maxcnt=0;
        for(int i=0;i<n;i++){
            if(nums[i]==1){
                cnt++;
            }
            else{
                cnt=0;
            }
            maxcnt=Math.max(maxcnt,cnt);
        }
        return maxcnt;
    }
}