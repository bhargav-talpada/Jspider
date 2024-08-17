let c = 0;
let sum = 0;
for(let i=0; i<=99; i++){
    if (i%2 == 0) {
        c++;
    }
    else{
        sum = sum + i;
    }
}
console.log(c);
console.log(sum);