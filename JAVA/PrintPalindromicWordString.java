public class PrintPalindromicWordString {
    public static void palidromicWord(String s){
        String rev = "";
        for(int i=0; i<s.length(); i++){
            rev = s.charAt(i) + rev;
        }
        if (rev.equals(s)) {
            System.out.println(rev);
        }
    }

    public static void main(String[] args) {
        String str = "hi ababa hello level aba";
        String[] arr = str.split(" ");
        for(String ele : arr){
            palidromicWord(ele);
        }
    }
}
