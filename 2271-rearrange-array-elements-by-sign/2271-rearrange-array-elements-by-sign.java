class Solution {
    public int[] rearrangeArray(int[] arr) {
        int n=arr.length;
        int[] pos=new int[n];
        int[] neg=new int[n];
        int p=0;
        int ne=0;
        for(int i=0;i<n;i++){
            if(arr[i]>0){
              pos[p++]=arr[i];
             
            }
            else{
                neg[ne++]=arr[i];
                
            }
        }
        int[] result=new int[n];
        for(int i=0;i<n;i++){
            if(i%2==0){
              
                result[i]=pos[i/2];
               
            }
            else{
              
                result[i]=neg[i/2];
              
            }
        }
        return result;
    }
}