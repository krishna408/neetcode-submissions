class Solution {

    private List<Integer> lengths;
    public String encode(List<String> strs) {
        lengths=strs.stream().map(e-> e.length()).toList();
        StringBuilder str=new StringBuilder();
        for(String s: strs){
            str.append(s);
        }
        return str.toString();
    }

    public List<String> decode(String str) {
        List<String> result=new ArrayList<>();
        
        int j=0;
        for(int i:lengths){
            StringBuilder sb=new StringBuilder();
            while(i>0){
                sb.append(str.charAt(j));
                j++;
                i--;
            }
            result.add(sb.toString());
        }

        return result;
    }
}
