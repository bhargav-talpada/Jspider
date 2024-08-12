public class BankOperation {
    
    int balance;

    BankOperation(int amt){
        this.balance = amt;
    }

    void depositAmount(int amt){
        System.out.println("You Deposit "+amt+" Rupees... ");
        balance += amt;
        System.out.println(amt+" Amount Successfully Deposit...");
    }

    void withdrawAmount(int amt){
        System.out.println("You Withdraw "+amt+" Rupees... ");
        if (amt <= balance) {
            balance -= amt;
            System.out.println(amt+" Amount Successfully Withdraw...");
        }
        else{
            System.out.println(amt+" Amount Withdraw Failed due to Low Balance...");
        }
    }

    void totalBalance(){
        System.out.println("Total Balance : "+ balance );
    }

}
