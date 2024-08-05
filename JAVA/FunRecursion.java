public class FunRecursion {

    public static void RecName(int n){
        if (n>=1) {
            System.out.println(n+" - Bhargav");
            RecName(n-1);
        }
    }
    public static int fibonnaci(int n){
        if (n>=2) {
            return fibonnaci(n-1) + fibonnaci(n-2);
        }
        else{
            return n;
        }
    }
    public static void main(String[] args) {
        RecName(10);
        int fibo = fibonnaci(10);
        System.out.println(fibo);
    }
}
