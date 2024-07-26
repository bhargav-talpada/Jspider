public class Practise27 {

    public static int squere(int n){
        return n * n;
    }
    public static void main(String[] args) {
        int a=5, b=6;
        int res = squere(a) + squere(b) + 2 * a * b;
        System.out.println(res);
    }
}
