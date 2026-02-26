import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        
        Map<String, Integer> map = new HashMap<>();
        
        for(String part: participant){
            int currentVal = map.getOrDefault(part, 0);
            
            map.put(part, currentVal + 1);
            
        }
        
        for(String complete: completion){
            
            map.put(complete, map.get(complete) - 1);
        }
        
        for(String item: map.keySet()){
            if(map.get(item) == 1){
                return item;
            }
        }
        
        return "-1";
    }
}