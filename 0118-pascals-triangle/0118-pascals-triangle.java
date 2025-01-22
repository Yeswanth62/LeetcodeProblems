class Solution {
    public static int ncr(int n,int r){
        long res=1;
        for(int i=0;i<r;i++){
            res=res*(n-i);
            res=res/(i+1);
        }
        return (int)res;
    } 
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascal=new ArrayList<>();
       
        for(int r=1;r<=numRows;r++){
             List<Integer> rows=new ArrayList<>();
             for(int c=1;c<=r;c++){
                rows.add(ncr(r-1,c-1));
             }
             pascal.add(rows);
        }
        return pascal;
    }
}