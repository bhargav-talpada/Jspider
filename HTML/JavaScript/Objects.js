// Object - is collection multiple type data
// 3 ways to create object

// ---------- 1. Object using literals ----------

// let student = {
//     id : 1144,
//     name : "Bhargav",
//     surName : "Talpada",
//     phnum : 1234567890,
//     percenrage : [79, 65, 69]
// }

// console.log('Your Name is :', student.name , student.surName);
// console.log('Your Degree Percentage is :', student.percenrage[0], "and Your HSC Percentage is :", student.percenrage[1], 'and Your SSC Percentage is :', student.percenrage[2]);
// student.eml = "bhargav@gmail.com";
// console.log('Your Contact is :', student.phnum, "and Email is :", student.eml);
// student.phnum = 987654321;  // update any value
// delete student.eml  // delete any key from the object
// console.log(student);  

// ---------- 2. Object using Constructor ----------

// function student(id, name, surName, phnum){
//     this.id = id;
//     this.name = name;
//     this.surName = surName;
//     this.phnum = phnum;
// }

// let s1 = new student(11, 'Bhargav', 'Talpada', 1234567890);
// console.log(s1);
// s1.name = 'parth';  // update
// s1.surName = 'sabhaya';
// s1.phnum = 9876543210;
// console.log(s1);
// delete s1.phnum;   // delete
// console.log(s1);

// ---------- 3. Object using Class ----------

// class car{
//     constructor(brand, name, color, price) {
//         this.brand = brand;
//         this.name = name;
//         this.color = color;
//         this.price = price;
//     }
// }
// let c = new car('Toyota', 'Glanza', 'White', 820000);
// console.log(c);
// c.brand = 'Hyundai';  //update
// c.name = 'I10 Nios';
// c.color = 'White';
// c.price = 750000;
// c.gear = 'manual';
// console.log(c);
// delete c.gear;  // delete
// console.log(c);