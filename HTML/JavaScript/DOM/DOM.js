// ----- createElement :- to create element(tag) int html
let h1 = document.createElement('h1'); 
console.log(h1);
h1.innerText = 'Bhargav Talpada';
h1.style.color = 'red';   // add style through js
h1.style.backgroundColor = 'blue';
h1.style.width = "250px";
h1.style.padding = '5px';
let img = document.createElement('img');
img.src = "css-logo.png";
img.style.width = "100px"
console.log(img);

// ------ getElemenById :- to select element using id
let body = document.getElementById('b');
console.log(body);

// ------ appendChild :- to add any child element in parent
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

// ------ getElementsByClassName :- to select any element using className
let p = document.getElementsByClassName('para');
p[0].innerText = "i am para tag";
p[1].textContent = "i am div";
console.log(p);

// ------ getElementsByTagName :- to select any element using tagName
let b = document.getElementsByTagName('b');
console.log(b);
b[0].innerText = "i am bold 1";
b[1].innerText = "i am bold 2";

// ------ querySelector :- to select any element using id, class, tag name and it gives only first occurence
let q = document.querySelector('b');
console.log(q);

// ------ querySelectorAll :- to select any element using id, class, tag name and it gives all element as a collection
let qa = document.querySelectorAll('.para');
console.log(qa);
