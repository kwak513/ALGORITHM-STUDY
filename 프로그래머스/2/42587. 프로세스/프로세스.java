import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        
        Queue<int[]> queue = new LinkedList<>();
        
        for(int i = 0; i < priorities.length; i++){
            
            queue.add(new int[]{i, priorities[i]});
        }
        
        int count = 0;
        
        while(!queue.isEmpty()){
            
            int[] polledItem = queue.poll();
            boolean hasBigger = false;
            
            for(int[] item: queue){
                int idx = item[0];
                int priorNum = item[1];
                
                if(polledItem[1] < priorNum){
                    hasBigger = true;
                    break;
                }
            }
            
            if(hasBigger){
                queue.add(polledItem);
            }
            else{
                count++;
                
                if(location == polledItem[0]){
                    return count;
                }
            }
        }
        
        return -1;
    }
}