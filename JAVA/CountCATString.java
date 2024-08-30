public class CountCATString {
    public static void main(String[] args) {
        String str = "abcatdrcatgdg";
        int c = 0;
        for(int i=0; i<str.length()-2; i++){
            if (str.charAt(i)=='c' && str.charAt(i+1)=='a' && str.charAt(i+2)=='t') {
                c++;
            }
        }
        System.out.println(c);
    }
}
