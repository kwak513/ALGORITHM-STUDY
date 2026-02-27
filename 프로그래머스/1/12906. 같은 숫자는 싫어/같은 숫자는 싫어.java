import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
        List<Integer> list = new ArrayList<>();
        
        list.add(arr[0]);
        
        for(int i = 1; i < arr.length; i++){
            int previousNum = arr[i - 1];
            int currentNum = arr[i];
            
            if(previousNum == currentNum){
                continue;
            }
            else{
                list.add(currentNum);
            }
        }
        
        int[] answer = new int[list.size()];
        
        for(int j = 0; j < list.size(); j++){
            answer[j] = list.get(j);
        }
        
        
        return answer;
        
        
        
    }
}