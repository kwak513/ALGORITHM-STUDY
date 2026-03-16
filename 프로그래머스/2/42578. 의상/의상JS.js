function solution(clothes) {
    
    const map = new Map();
    
    for(let i = 0; i < clothes.length; i++){
        const name = clothes[i][0];
        const type = clothes[i][1];
        
        const currentVal = map.get(type) || 0;
        
        map.set(type, currentVal + 1);
    }
    
    let answer = 1;
    
    for(const key of map.keys()){
        const val = map.get(key);
        answer *= (val + 1);
    }
    
    return answer - 1;
    
}
