class Solution {
    public List<String> findWords(char[][] board, String[] words) {
        List<String> res = new ArrayList<>();
        for(int i = 0 ; i < board.length ; i++){
            for(int j = 0 ; j < board[0].length ; j++){
                for(String word : words)
                    if(board[i][j] == word.charAt(0) && dfs(board , word , i , j , 0)){
                        if(res.contains(word)) continue;
                        else res.add(word);
                    }
                }
            }
        return res;
    }
    
    public boolean dfs(char[][] board, String word , int i , int j , int count){
        if(word.length() == count) return true;
        if(i < 0|| j < 0 || i >= board.length || j >= board[0].length || board[i][j] != word.charAt(count)){
            return false;
        }
        char temp = board[i][j];
        board[i][j] = '*';
        boolean check = dfs(board , word , i+1 , j , count+1)
            || dfs(board , word , i-1 , j , count+1)
            || dfs(board , word , i , j-1 , count+1)
            || dfs(board , word , i , j+1 , count+1);
        board[i][j] = temp;
        return check;         
    }
}
