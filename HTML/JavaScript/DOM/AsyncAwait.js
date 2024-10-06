off data();
async function data() {
    let body = document.getElementById('img-container');
    let data = await fetch('https://jsonplaceholder.typicode.com/photos');
    let jsonRes = await data.json();
    console.log(jsonRes);   
    let div = document.createElement('div');
    div.style.display = 'grid';
    div.style.gridTemplateColumns = 'auto auto auto auto auto auto';
    div.style.padding = '20px';
    div.style.gap = '15px';
    jsonRes.map((i) => {
        let img = document.createElement('img');
        img.src = i.url;
        img.style.height = '200px';
        img.style.width = '200px';
        div.appendChild(img);
    })
    body.appendChild(div);
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
