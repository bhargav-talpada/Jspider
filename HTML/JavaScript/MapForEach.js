let arr = [10, 20, 30, 40];

// map traverse every element and also return every element...
let a = arr.map((i) => {
    return i;
})
console.log(a);

// forEach only traverse every element and print element it can not return anything...
arr.forEach((i) => {
    console.log(i)
})
