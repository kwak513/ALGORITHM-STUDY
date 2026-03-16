function solution(s){
    
    const stack = [];
    
    for(let i = 0; i < s.length; i++){
        let currentChar = s[i];
        
        if(currentChar === "("){
            stack.push(currentChar);
        }
        else if(currentChar === ")"){
            if(stack.length !== 0){
                stack.pop();
            }
            else{
                return false;
            }
        }
    }
    
    if(stack.length === 0){
        return true;
    }
    else{
        return false;
    }
    
}
