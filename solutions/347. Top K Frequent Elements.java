class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer , Integer> map = new HashMap<>();
        PriorityQueue<int[]> q = new PriorityQueue<>((a,b) -> a[1]-b[1]);
        for(int i : nums){
            map.put(i , map.getOrDefault(i ,0)+1);
        }
        for(int i : map.keySet()){
            q.offer(new int[]{i,map.get(i)});
            if(q.size() > k)
                q.poll();
        }
        int[] res = new int[k];
        for(int i = k-1 ; i >= 0 ; i--){
            res[i] = q.poll()[0];
        }
        //System.out.println(map);
        return res;
    }
}
