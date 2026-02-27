class Solution {
    public int[] solution(int[] prices) {
        
        int[] answer = new int[prices.length];
        
        for(int i = 0; i < prices.length; i++){
            int currentPrice = prices[i];
            
            answer[i] = (prices.length - 1) - i;
            
            
            for(int j = i + 1; j < prices.length; j++){
                int nextPrice = prices[j];
                
                if(currentPrice > nextPrice){
                    answer[i] = j - i;
                    break;
                }
                
            }
            
        }
        
        return answer;
        
    }
}