class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        List<int[]> result = new ArrayList();
        int i = 0;
        int j = 0;
        while(i < firstList.length && j < secondList.length){
            //if overlap
            if(firstList[i][0] <= secondList[j][1] && firstList[i][1] >= secondList[j][0]){
                int start = Math.max(firstList[i][0] , secondList[j][0]);
                int end = Math.min(firstList[i][1] , secondList[j][1]);
                result.add(new int[]{start,end});
                
            }
            if(firstList[i][1] > secondList[j][1]){
                j++;
            }else{
                i++;
            }
        }
        
        return result.toArray(new int[result.size()][]);
    }
}
