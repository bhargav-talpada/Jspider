import java.util.Scanner;

public class Fizzbuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int f = 0;
        int l = 0;

        for (int i = 0; i <n; i++) {
            f = n%10;
            sum = sum + f;
            l = n / 10;
        }
        System.out.println(sum);
        if(sum%5==0 && sum%3==0){
            System.out.println("fizzbuzz");
        }
        else if (sum%5==0) {
            System.out.println("fizz");
        }
        else if (sum%3==0) {
            System.out.println("buzz");
        }
        else {
            System.out.println("dummy");
        }
    }    
}