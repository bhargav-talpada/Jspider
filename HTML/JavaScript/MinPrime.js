function isPrime(a, b){
    let c = 0;
    for(let i=a; i<=b; i++){
        for(let j=1; j<=a; j++){
            if (i % j == 0) {
                c++;
            }
        }
        
        if (c == 2) {
            console.log(i);
        }
    }
}

isPrime(38, 98);