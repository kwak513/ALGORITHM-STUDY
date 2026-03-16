function solution(prices) {
    
    const answer = [];
    
    for(let i = 0; i < prices.length; i++){
        
        let currentPrice = prices[i];
        
        answer[i] = (prices.length - 1) - i;
        
        for(let j = i + 1; j < prices.length; j++){
            let nextPrice = prices[j];
            
            if(currentPrice > nextPrice){
                answer[i] = j - i;
                break;
            }
        }
        
        
    }
    return answer;
}
