import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        
        Arrays.sort(phone_book);
        
        for(int i = 0; i <= phone_book.length - 2; i++){
            String currentNum = phone_book[i];
            String nextNum = phone_book[i + 1];
            
            if(nextNum.startsWith(currentNum)){
                return false;
            }
        }
        
        return true;
        
    }
}