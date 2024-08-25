public class RecursionMatrix {
    static int m;
    static void row(int n){
        if (n >= 1) {
            cols(m);
            System.out.println();
            row(n - 1);
        }
    }
    static void cols(int n){
        if (n >= 1) {
            System.out.print("* ");
            cols(n - 1);
        }
    }
    public static void main(String[] args) {
        int n = 10;
        m = n;
        row(n);
    }
}
