import java.util.Scanner;

public class BankOpMainClass {
    public static void main(String[] args) {

        BankOperation b1 = new BankOperation(10000);
        b1.totalBalance();   
        b1.withdrawAmount(4500);
        b1.totalBalance();
        b1.depositAmount(3000);
        b1.totalBalance();
        b1.withdrawAmount(8500);
        b1.totalBalance();        
    }
}
