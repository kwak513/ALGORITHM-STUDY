function solution(number, k) {
    
    const stack = [];
    let answerLength = number.length - k;

    for(const c of number.split("")){
        // 지우는 경우
        while(k > 0 && stack.length !== 0 && stack[stack.length - 1] < c){               
            stack.pop();
            k--;
        }
        stack.push(c);
    }

    return stack.join("");
    
}
