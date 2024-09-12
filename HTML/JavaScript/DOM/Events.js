let body = document.querySelector('#b');
body.style.transition = "0.7s";

let btn = document.querySelector('button');
btn.style.backgroundColor = "green";
btn.style.padding = "10px 20px";
btn.style.border = "1px solid green"
btn.style.borderRadius = "10px"
btn.style.color = "white";
btn.style.cursor = "pointer";

function changeColor(){
    if(body.style.backgroundColor != "black"){
        body.style.backgroundColor = "black";
        body.style.color = 'white';
    }
    else{
        body.style.backgroundColor = "white";
        body.style.color = 'black';
    }
}