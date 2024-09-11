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

let h3 = document.createElement('h3');
h3.innerHTML = "Document Object Model";
console.log(h3);

body.appendChild(h3);

let input = document.createElement('input');
input.placeholder = "Enter Name";
console.log(input);
body.appendChild(input);

let p = document.getElementsByClassName('para');
p[0].innerText = "i am para tag";
p[1].textContent = "i am div";
console.log(p);