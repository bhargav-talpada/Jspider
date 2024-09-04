let arr = [5, 14, 2, 22, 57, 6, 0];

for(let i=0; i<arr.length; i++){
    for(let j=0; j<arr.length; j++){
        if (arr[j] > arr[j+1]) {
            let t = arr[j+1];
            arr[j+1] = arr[j];
            arr[j] = t;
        }
    }
}
console.log(arr);