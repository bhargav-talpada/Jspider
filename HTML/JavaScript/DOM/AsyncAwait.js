// data();
// async function data() {
//     let data = await fetch('https://jsonplaceholder.typicode.com/users');
//     let jsonRes = await data.json();
//     console.log(jsonRes);   
// }

let a = 10;
let b = 20;
function parent() {
    let c = 30;
    let d = 40;
    console.log(a+b+c);
    function child() {
        console.log(d);
        
        d = 140;
        console.log(a+b+c+d);
        
    }
    child();
}
parent();