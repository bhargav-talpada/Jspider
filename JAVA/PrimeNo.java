// A number has a only 2 factors is a Prime Number

import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();
        int c = 0;
        for(int i=1; i<=n; i++){
            if (n%i==0) {
                c++;
            }
        }
        if(c==2){
            System.out.println(n+" is Prime");
        }
        else{
            System.out.println(n+" is not Prime");
        }
    }
}
