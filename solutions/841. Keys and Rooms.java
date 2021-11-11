class Solution {
    boolean[] visited;
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        visited = new boolean[rooms.size()];
        visited[0] = true;
        dfs(rooms , 0);
        for(boolean i : visited)
            if(i == false)
                return false;
        return true;
    }
    public void dfs(List<List<Integer>> rooms , int pos){
        for(int i : rooms.get(pos)){
            if(!visited[i]){
                visited[i] = true;
                dfs(rooms , i);
            }
        }
    }
}
