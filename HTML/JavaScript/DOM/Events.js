let body = document.querySelector('#b');
body.style.transition = "0.7s";

let btn = document.querySelector('.btn');
btn.style.backgroundColor = "green";
btn.style.padding = "10px 20px";
btn.style.border = "1px solid green"
btn.style.borderRadius = "10px"
btn.style.color = "white";
btn.style.cursor = "pointer";   
btn.style.boxShadow = "5px 5px 15px black"

let p = document.querySelectorAll('p');
p[0].style.fontSize = "20px";
p[1].style.fontSize = "20px";
p[2].style.fontSize = "20px";
p[3].style.fontSize = "20px";
p[4].style.fontSize = "20px";

function changeColor(){
    if(body.style.backgroundColor != "black"){
        body.style.backgroundColor = "black";
        body.style.color = 'white';
        btn.style.boxShadow = "5px 5px 10px white"
    }
    else{
        body.style.backgroundColor = "white";
        body.style.color = 'black';
        btn.style.boxShadow = "5px 5px 10px black"
    }
}

function login() {
    let unm = document.querySelector('#unm').value;
    let pwd = document.querySelector('#pwd').value;

    if (unm == "bhargav" && pwd == "123") {
        alert('login...');       
    } else {
        alert('invalid...')
    }
}
