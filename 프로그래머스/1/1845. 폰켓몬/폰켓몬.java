import java.util.*;

class Solution {
    public int solution(int[] nums) {
        Set<Integer> set = new HashSet<>();
        
        for(int num: nums){
            set.add(num);
        }
        
        int setSize = set.size();
        int numLength = nums.length / 2;
        
        if(setSize > numLength){
            return numLength;
        }
        else{
            return setSize;
        }
    }
}