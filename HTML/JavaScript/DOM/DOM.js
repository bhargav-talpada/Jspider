let h1 = document.createElement('h1');
console.log(h1);
h1.innerText = 'Bhargav Talpada';
h1.style.color = 'red';
h1.style.backgroundColor = 'blue';
h1.style.width = "250px";
h1.style.padding = '5px';
let img = document.createElement('img');
img.src = "css-logo.png";
img.style.width = "100px"
console.log(img);

let body = document.getElementById('b');
console.log(body);

body.appendChild(h1);
body.appendChild(img);