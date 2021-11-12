class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer , Integer> map = new HashMap<>();        
        for(int i : nums){
            map.put(i , map.getOrDefault(i,0)+1);
        }
        PriorityQueue<int[]> q = new PriorityQueue<>((a,b) -> a[1] == b[1] ? b[0]-a[0] : a[1]-b[1]);
        for(int i : map.keySet()){
            q.offer(new int[]{i,map.get(i)});
        }
        int k = 0;
        while(q.size() > 0){
            int[] curr = q.poll();
            int elem = curr[0];
            int freq = curr[1];
            for(int i = 0 ; i < freq ; i++){
                nums[k] = elem;
                k++;
            }
        }
        return nums;
    }
}
