hoisting
a = 10; // initialize
var a;  // Declare
console.log(a);
a = "bhargav"; // re-initialize
console.log(a);
var a = true; // re-declare
console.log(a);

console.log("================");

let b;  //declare
b = 10; // initialize
console.log(b);
b = 20; // re-initialize
console.log(b);
// let b = 10; // can't re-declare

console.log("================");

const c = 10;;  //declare & initialize
console.log(c);
// c = 20;  // can't re-initialize
// const c = 30; // can't re-declare
