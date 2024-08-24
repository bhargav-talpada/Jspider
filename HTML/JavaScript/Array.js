let arr = [11, "bhargav", 1.1, true, ["talpada", 44, null, undefined]];
console.log(arr);
// console.log(arr.length);
// console.log(arr[1]);
// console.log(arr[3]);
// console.log(arr[4]);
// console.log(arr[4][0]);
// console.log(arr[4][2]);
// console.log(arr[4][3]);

// push method -> add element at last position
arr.push(1144, "JavaScript");
console.log(arr);

// pop method -> remove element at last position
arr.pop();
console.log(arr);

// unshift method just like push -> add element at first position
arr.unshift(null, 4, "hello", [undefined]);
console.log(arr);

// shift method just like pop -> remove element at first position
arr.shift();
console.log(arr);
off
