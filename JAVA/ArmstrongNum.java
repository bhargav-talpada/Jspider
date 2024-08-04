import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args) {
        int n, count = 0, a, rem, c, sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number:");
        n = s.nextInt();
        a = n;
        c = n;
        while(a > 0)
        {
            a = a / 10;
            count++;
        }
        while(n > 0)
        {
            rem = n % 10;
            sum = (int) (sum+Math.pow(rem, count));
            n = n / 10;
        }
        if(sum == c)
        {
            System.out.println(c+ " is an Armstrong number");
        }
        else
        {
            System.out.println(c+ " is not an Armstrong number");
        }     
        
    }
}
