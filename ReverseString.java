class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String[] arr=s.split(" ");
        List<String> l=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(!arr[i].isEmpty()) l.add(arr[i]);
        }
        Collections.reverse(l);
        return String.join(" ",l);
    }
}
