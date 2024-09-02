public class ExamPattern {
    public static void main(String[] args) {
        int n = 5;
        char c = 'z';
        char d;
        for(int i=0; i<=n; i++){
            for(int j=0; j<i; j++){
               d = (char)(c-j);
               System.out.print(d+ " "); 
            }
            System.out.println();
        }
    }
}
