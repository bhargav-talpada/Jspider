public class AlphaNumScSeparate {
    public static void main(String[] args) {
        String str = "AB4$5jkl*hj458@H#";
        String alpha = "", num = "", sc = "";
        char c;

        for(int i=0; i<str.length(); i++){
            c = str.charAt(i);
            if ((c>='a' && c<='z') || (c>='A' && c<='Z')) {
                alpha = alpha + c;
            }
            else if (c>='0' && c<='9') {
                num = num + c;
            }
            else{
                sc = sc + c;
            }
        }
        System.out.println(alpha+num+sc);
    }
}
