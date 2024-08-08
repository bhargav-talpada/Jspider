import java.util.Scanner;

public class NthPrimeNo {
    
    static boolean isPrime(int nm){
        int c = 0;
        for (int i = 1; i <= nm; i++) {
            if (nm%i == 0) {
                c++;
            }
        }
        return c==2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 0;
        for(int i=1;; i++){
            if (isPrime(i)) {
                c++;
                // System.out.print(i+ " ");
            }
            if (c==n) {
                System.out.println(i);
                break;
            }
        }
    }
}
