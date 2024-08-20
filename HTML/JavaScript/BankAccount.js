let nm = "Bhargav";
let age = 31;
let email = "bhargav@gmail.com";
let pwd = 123456;
let phone = 9987456321;

if (nm == "Bhargav" &&  phone == 9987456321 && pwd == 123456) {
    console.log(nm+" You are a Login Successfully");
    
    if (age > 30) {
        console.log("Rate of Intrest is 20%");
    }
    else if (age > 20) {
        console.log("Rate of Intrest is 30%");        
    }
    else{
        console.log("Not eligible for loan");
    }
}
else{
    console.log("Invalid name & password");
    
}
