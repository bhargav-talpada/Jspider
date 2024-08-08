import java.util.Scanner;

public class NthFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int position = sc.nextInt();
        int n1 = 0, n2 = 1, n3 = 0;
        if (position == 1) {
            System.out.println(0);
        }
        else if (position == 2) {
            System.out.println(1);
        }
        else{
            for(int i=3; i<=position;i++){
                n3 = n1+n2;
                n1=n2;
                n2=n3;
            }
            System.out.println(n3);
        }
    }
}
