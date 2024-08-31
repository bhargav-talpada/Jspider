// Anonymous function - function without function name....
// function can not call/invoked without calling function name...
// to call the anonymous function 2 ways


// 1. IIFE - Immediate Invoked Function Expression
// to write anonymous function in function parenthesis anc call immediatlly...

(function(a,b){
    return console.log(a+b);
})(10,20);

// 2. Function with Expression
// define a variable and store anounymous functoin in that variable and call as a function call...
let f = function(a,b){
    return console.log(a+b);    
}
f(50,54);
