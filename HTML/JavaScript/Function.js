// ---------- Normal Functions ----------

// function print(){
//     console.log("Bhargav Talpada");    
// }
// print();

// function add(num1, num2){
//     let sum = num1 + num2;
//     console.log(sum);    
// }
// add(54, 45);

// function adds(num1, num2, num3) {
//     let sum = num1 + num2 + num3;
//     return sum;
// }
// let a = adds(45, 54, 68);
// console.log(a);

// ---------- Arrow Functions ----------

// let sum = (a,b) => {
//     return a+b;
// }
// console.log(sum(10,50));

// ---------- Callback & First Order & Higher Order Functions ----------

// function add(a,b) {
//     return a+b;
// }

// => in above code add function is a first order function because it cannot takes any function as a argument & cannot return any function. 

// function total(calc, a,b) {
//     return calc(a,b);
// }
// console.log(total(add,20, 45));

// => in above code calc & add is a callback function because that both functions passed as a parameter in total function.
// => total function is a Higher order function because it takes a calc function as a argument and return it.