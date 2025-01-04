class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int[] temp=new int[n];
        for(int i=0;i<n;i++){
            temp[i]=nums[i];
            nums[i]=0;
        }
        int j=0;
        for(int i=0;i<n;i++){
            if(temp[i]!=0){
                nums[j]=temp[i];
                j++;
            }
        }
    }
}