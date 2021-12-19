class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> map = new HashMap<>();
        String[] word = s.split(" ");
        if(word.length != pattern.length()) return false;
        
        for(int i = 0 ; i < pattern.length() ; i++){
            char curr = pattern.charAt(i);
            
            if(map.containsKey(curr)){
                if(!map.get(curr).equals(word[i])){
                    return false;
                }
            }
            
            else{
                if(map.containsValue(word[i])){
                    return false;
                }
                map.put(curr , word[i]);
            }
        }
        return true;
    }
}
