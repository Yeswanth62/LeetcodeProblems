class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> output=new ArrayList<>();
        int[] maxfreB=new int[26];
        for(String str:words2){
            int[] curfre=new int[26];
            for(char c:str.toCharArray()){
                curfre[c-'a']++;
            }
            for(int i=0;i<26;i++){
                maxfreB[i]=Math.max(maxfreB[i],curfre[i]);
            }
        }

        for(String uni:words1){
            int[] curr=new int[26];
            for(char ch:uni.toCharArray()){
                curr[ch-'a']++;
            }
            for(int i=0;i<26;i++){
                if(maxfreB[i]>curr[i]){
                    break;
                }
               if(i==25) output.add(uni);
            }
        }
    return output;
    }
}