// Object inside Array

let cart = [
    {
        id : 101,
        name : "Samsung S24 Ultra",
        price : 45000,
    },
    {
        id : 102,
        name : "Moto Edge 50 Fusion",
        price : 24000,
    },
    {
        id : 103,
        name : "HP 15s",
        price : 41500,
    },
    {
        id : 104,
        name : "Rolex Premium Watch",
        price : 2500,
    },
    {
        id : 105,
        name : "OnePlus Budz",
        price : 3000,
    }

];

// map - map work like a for loop it traverse to each every element in array or object...
// cart.map((i) => console.log(i));/

// filter - it return either true or false if condition is true, and it return value only when condition is true...
// let p = cart.filter((i) => {
//     return i.price > 50000
// })
// console.log(p);

// reduce
let sum = 0;
let total = cart.reduce((sum, i) => {
    sum= sum + i.price, 0
})
console.log(total);

