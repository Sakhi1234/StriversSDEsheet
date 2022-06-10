class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> arr=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> row=new ArrayList<>();
            int val=1;
            for(int j=0;j<=i;j++){
                row.add(val);
                val=val*(i-j)/(j+1);
            }
            arr.add(row);
        }
        return arr;
    }
}
