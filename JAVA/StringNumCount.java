public class StringNumCount {
    public static void main(String[] args) {
        String str = "12345678910";
        char c;
        int sum = 0;
        for(int i=0; i<str.length(); i++){
            c = str.charAt(i);
            if (c>='0' && c<='9') {
                sum = sum + (c - 48);
            }
        }
        System.out.println(sum);
    }
}
