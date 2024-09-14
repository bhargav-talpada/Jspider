public class PalindromicSequenceString {

    public static boolean isPalindrome(String str){
        String rev = "";
        for(int i=0; i<str.length(); i++){
            rev = str.charAt(i) + rev;
        }

        return rev.equals(str);
    }
    public static void main(String[] args) {
        String str = "adgdaaadhjhikki";
        for(int i=0; i<str.length(); i++){
            String temp = "" + str.charAt(i);
            for(int j=i+1; j<str.length(); j++){
                temp = temp + str.charAt(j);
                if (isPalindrome(temp)) {
                    System.out.println(temp);
                }
            }
        }
    }
}
