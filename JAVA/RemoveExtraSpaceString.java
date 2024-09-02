

public class RemoveExtraSpaceString {
    public static void main(String[] args) {
        String str = "hello hi   hge";   
        String newStr = "";
        for(int i=0; i<str.length(); i++){
            // if (str.charAt(i) == " " && str.charAt(i+1) == " ") {
            //     continue;
            // }
            newStr = newStr + str.charAt(i);
        }
    }
    
}