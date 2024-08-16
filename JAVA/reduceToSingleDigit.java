import java.util.Scanner;

public class reduceToSingleDigit {
    static int sumDigit(int n){
        int sum = 0, rem = 0;
        while (n!=0) {
            rem = n % 10;
            sum = sum + rem;
            n = n / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n > 9) {
            n = sumDigit(n);
        }
        System.out.println(n);
    }
}

// secound login
// if(n%9){

// }