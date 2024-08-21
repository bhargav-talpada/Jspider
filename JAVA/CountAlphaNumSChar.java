public class CountAlphaNumSChar {
    public static void main(String[] args) {
        String s = "bhargav1144@gmail.414com";
        int a = 0, n = 0, sc = 0;
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if ((c>='A' && c<='Z') || (c>='a' && c<='z')) {
                a++;
            }
            else if (c>='0' && c<='9') {
                n++;
            }
            else{
                sc++;
            }
        }
        System.out.println("Alpha : "+ a);
        System.out.println("Numeric : "+ n);
        System.out.println("Special : "+ sc);
    }
}
