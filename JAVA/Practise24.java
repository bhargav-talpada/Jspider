public class Practise24 {
    public static void intrest(int p, int r, int t){
        int si = p * r * t / 100;
        System.out.println("Price is : "+ p);
        System.out.println("Rate is : "+ r);
        System.out.println("Time is : "+ t + " years ");
        System.out.println("Simple Intrest is : "+ si);
    }
    public static void main(String[] args) {
        intrest(320000, 14, 2);
    }
}
