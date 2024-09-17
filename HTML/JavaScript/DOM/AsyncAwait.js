data();
async function data() {
    let body = document.getElementById('img-container');
    let data = await fetch('https://jsonplaceholder.typicode.com/users');
    let jsonRes = await data.json();
    console.log(jsonRes);   
    jsonRes.map((i) => {
        let h1 = document.createElement('h1');
        h1.innerText = i.name;
        h1.style.fontFamily = 'cursive';
        h1.style.fontSize = '15px';
        body.appendChild(h1);
    })
}


// clousers ===> to access parent function variables in child function but can not accss
//              child function variables in parent function.....
// let a = 10;
// let b = 20;
// function parent() {
//     let c = 30;
//     let d = 40;
//     console.log(a+b+c);
//     function child() {
//         console.log(d);
        
//         d = 140;
//         console.log(a+b+c+d);
        
//     }
//     child();
// }
// parent();