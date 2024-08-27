public class AlphaConvert {
    public static void main(String[] args) {
        String str = "HelLo231 @byE Hi";
        String New = "";
        char c;
        for(int i=0; i<str.length(); i++){
            c = str.charAt(i);
            if ((c>='a' && c<='z')) {
                c -= 32;
            }
            else if ((c>='A' && c<='z')) {
                c += 32;
            }
            New = New + c;
            
        }
        System.out.println(New);
    }
}
