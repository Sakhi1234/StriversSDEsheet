class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> hm=new HashMap<>();
        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);
        
        int sum=0;
        sum+=hm.get(s.charAt(s.length()-1));
        
         for(int i=s.length()-2;i>=0;i--) {
            int n1 = hm.get(s.charAt(i));
            int n2 = hm.get(s.charAt(i+1));
            if(n1<n2) {
                sum-=n1;
            } else {
                sum+=n1;
            }
        }
        return sum;
    }
}
