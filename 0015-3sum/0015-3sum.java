class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
        Set<List<Integer>> uni=new HashSet<>();
        for(int i=0;i<n;i++){
            Set<Integer>set=new HashSet<>();
            for(int j=i+1;j<n;j++){
                int c=-(nums[i]+nums[j]);
                if(set.contains(c)){
                    List<Integer> list=Arrays.asList(nums[i],nums[j],c);
                    list.sort(null);
                    uni.add(list);
                }
                set.add(nums[j]);
            }
        }
        List<List<Integer>> ans=new ArrayList<>(uni);
        return ans;
    }
}