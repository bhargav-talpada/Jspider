let str = "Level123@#$smh547&8HGTS";

// ---------- Reverse string ----------
// let rev = "";
// let c;
// for(let i=0; i<str.length; i++){
//     c = str.charAt(i);
//     rev = c + rev;
// }
// console.log(rev);

// ---------- Palindrome string ----------
// let rev = "", c;
// str = str.toLowerCase();
// for(let i=0; i<str.length; i++){
//     c = str.charAt(i);
//     rev = c + rev;
// }
// console.log(rev === str ? "Palindrome" : "Not");

// ---------- Saparate Alpha, Num, SpecialChar in string ----------
// let c,a1 = "", a2 = "", n = "", sc = "";
// for(let i=0; i<str.length; i++){
//     c = str.charAt(i);
//     if (c>='A' && c<='Z') {
//         a1 = a1 + c;
//     }
//     else if (c>='a' && c<='z') {
//         a2 = a2 + c;
//     }
//     else if (c>='0' && c<='9') {
//         n = n + c;
//     }
//     else{
//         sc = sc + c;
//     }
// }
// console.log(a1+a2+n+sc);

// ---------- Count Alpha, Num, SpecialChar in string ----------
// let c, a="", n="", s="";
// for(let i=0; i<str.length; i++){
//     c = str.charAt(i);
//     if ((c>='A' && c<='Z') || (c>='a' && c<='z')) {
//         a++;
//     }
//     else if (c>='0' && c<='9') {
//         n++;
//     }
//     else{
//         s++;
//     }
// }
// console.log("Alpha : ", a);
// console.log("Num : ", n);
// console.log("Special : ", s);

// ---------- Convert Upper alpha to Lower & Lower alpha to Upper in string ----------
// let c, n="";
// for(let i=0; i<str.length; i++){
//     c = str.charAt(i);
//     if (c>='a' && c<='z') {
//         c -= 32;
//     }
//     else if(c>='A' && c<='Z'){
//         c += 32;
//     }
//     n = n + c;
// }
// console.log(n);
