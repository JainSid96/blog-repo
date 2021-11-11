class Solution {
    public long countVowels(String word) {
        int i = 0;
        long res = 0;
        int n = word.length();
        for(char ch : word.toCharArray()){
            if("aeiou".indexOf(ch)>=0)
                res += (long)(i+1)*(n-i);
            i++;
        }
        return res;
    }
}
