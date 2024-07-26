public class Practise28 {
    public static int test(int n){
        System.out.println("Test() Running...");
        return n;
    }
    public static void main(String[] args) {
        System.out.println("Main Start...");
        test(10);
        System.out.println(test(20));
        int x = test(30);
        System.out.println("X Value : "+ x);
        System.out.println("Main End...");
    }
}
