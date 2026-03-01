import java.util.*;

class Solution {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
                
        
        for(int i = 0; i < s.length(); i++){
            
            char currentChar = s.charAt(i);
            
            if(currentChar == '('){
                stack.push(currentChar);
            }
            else if(currentChar == ')'){
                if(!stack.isEmpty()){
                    stack.pop();
                }
                else{
                    return false;
                }
                
            }
        }
        
        if(stack.isEmpty()){
            return true;
        }
        else{
            return false;
        }
            
            
            
            
    }
}