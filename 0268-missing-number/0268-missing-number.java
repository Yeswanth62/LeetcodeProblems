class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int large=Integer.MIN_VALUE;
        int index=0;
        int[] temp=new int[n+1];
        for(int i=0;i<n;i++){
        //     int flag=0;
        //    for(int j=0;j<n;j++){
        //     if(nums[j]==i){
        //         flag=1;
        //         break;
        //     }
        //    }
        //    if(flag==0){
        //     index=i;
        //    }
              temp[nums[i]]++;
         }
         for(int i=0;i<n+1;i++){
            if(temp[i]==0){
                index=i;
            }
         }
         return index;
    }
}