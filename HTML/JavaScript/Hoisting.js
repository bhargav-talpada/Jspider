// var support variable hoisting.....
console.log(a);
var a = 10;

// let and const not support variable hoisting...
// console.log(b)
let b = 20;
// console.log(c);
const c = 30;

// normal function support function hoisting...
sum();
function sum() {
    console.log("function");    
}

// function with expression can not support function hoisting...
// fn();
let fn = function(){
    console.log('fn expression');
}

// arrow function can not support function hoisting...
// fn2();
let fn2 = () => {
    console.log('arrow');    
}

