let arr = [110, 210, 34, 2004, 100];

// ---------- Sum of array elemeny ----------
// let sum = 0;
// for(let i=0; i<arr.length; i++){
//     sum += arr[i];
// }
// console.log(sum);

// ---------- min element of array ----------
// let min = arr[0];
// for(let i=0; i<arr.length; i++){
//     if(min > arr[i]){
//         min = arr[i];
//     }
// }
// console.log(min);

// ---------- max element of array ----------
let max = arr[0];
for(let i=0; i<arr.length; i++){
    if (max < arr[i]) {
        max = arr[i];
    }
}
console.log(max);
