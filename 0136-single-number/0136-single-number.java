class Solution {
    public int singleNumber(int[] nums) {
        int n=nums.length;
        if(n==1)return nums[0];
        int xor=0;
        for(int i=0;i<n;i++){
        xor^=nums[i];
        }
        return xor;
    }
}