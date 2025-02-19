class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        List<Integer> list=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        int mini=(int)n/3;
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(HashMap.Entry<Integer,Integer> a: map.entrySet()){
            if(a.getValue()>mini){
                list.add(a.getKey());
            }
        }
        return list;
    }
}