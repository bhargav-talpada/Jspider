public class pattern4 {
    public static void main(String[] args) {
        int c = 1;
        for (int i = 1; i <=4; i++) {
            for (int j = 1; j <=4; j++) {
                if (j<=i) {
                    System.out.print(c+" ");
                    c++;
                }                
            }
            System.out.println();
        }
    }
}
