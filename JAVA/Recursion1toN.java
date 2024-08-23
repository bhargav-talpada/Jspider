public class Recursion1toN {
    
    static int i = 1;
    static void printN(int n){
        if (n>=i) {
            System.out.println(i);
            i++;
            printN(n);
        }
    }
    public static void main(String[] args) {
        printN(15);
    }    
}