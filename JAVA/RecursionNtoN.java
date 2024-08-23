public class RecursionNtoN {

    static int i = 1;
    static void printN(int n){
        if (n >= i) {
            System.out.println(n);
            // i++;
            printN(n-1);
            // i--;
            System.out.println(n);
        }
        else{
            System.out.println(0);
        }
    }

    public static void main(String[] args) {
        printN(5);
    }
}
