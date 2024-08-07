public class Person {

    int pin;
    int balance;
    void updatePin(int p){
        this.pin = p;
    }
    void deposite(int b, int p){
        if (this.pin == p) {
            this.balance = this.balance + b;
            System.out.println(b + " Deposited Successfully");
        }
        else{
            System.out.println("Incorrect Pin Please enter correct pin....");
        }
        
    }
    void withdrow(int b, int p){
        if (this.pin == p) {
            this.balance = this.balance - b;
            System.out.println(b + " Withdrow Successfully");
        }
        else{
            System.out.println("Incorrect Pin Please enter correct pin....");
        }
        
    }
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.updatePin(1234);
        System.out.println("Pin : "+p1.pin);
        p1.deposite(1000, 1234);
        p1.deposite(5000, 1234);
        p1.deposite(4000, 1234);
        System.out.println("Total Balance : " + p1.balance);
        p1.withdrow(2000, 1234);
        p1.withdrow(3000, 1234);
        System.out.println("Total Balance : " + p1.balance);
        p1.deposite(2500, 1234);
        System.out.println("Total Balance : " + p1.balance);
    }
}
