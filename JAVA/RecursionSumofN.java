public class RecursionSumofN {
    static int sum = 0, i = 1;

    static int sumN(int n){
        if (i <= n) {
            sum = sum + i;
            i++;
            sumN(n);
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumN(11));
    }
}
