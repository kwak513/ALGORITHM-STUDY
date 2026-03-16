function solution(nums) {
    
    const set = new Set();
    
    for(const num of nums){
        set.add(num);
    }
    
    const setSize = set.size;
    const numLength = nums.length / 2;
    
    if(setSize > numLength){
        return numLength;
    }
    else{
        return setSize;
    }
    
    
}
