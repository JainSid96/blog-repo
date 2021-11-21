class Solution {
    public String longestPalindrome(String s) {
        if(s == null || s.length() < 1) return "";
        int start = 0 , end = 0;
        for(int i = 0 ; i < s.length() ; i++){
            int len1 = search(s , i , i);
            int len2 = search(s , i , i+1);
            int len = Math.max(len1, len2);
            if(len > end-start){
                start = i - (len-1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start , end+1);
    }
    public int search(String S , int start , int end){
        int left = start;
        int right = end;
        while(left >= 0 && right < S.length() && S.charAt(left) == S.charAt(right)){
            left--;
            right++;
        }
        return right-left-1;
    }
}
