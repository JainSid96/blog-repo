class Solution {
    public String frequencySort(String s) {
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        sb.append(ch[0]);
        for(int i = 1 ; i < ch.length ; i++){
            if(ch[i] != ch[i-1]){
                list.add(sb.toString());
                sb = new StringBuilder();
            }
            sb.append(ch[i]);
        }
        list.add(sb.toString());
        
        Collections.sort(
            list , (a,b) -> b.length() - a.length()
        );
        
        StringBuilder result = new StringBuilder();
        for(String str : list){
            result.append(str);
        }
        return result.toString();
    }
}
