/**
 * RemoveCharRightLeft
 */
public class RemoveCharRightLeft {

    public static void main(String[] args) {
        String str = "bhargav";
        int i=0, j=str.length()-1;

        System.out.println(str);
        for(int k=0; k<str.length(); k++){
            if (k%2 == 0) {
                j--;
            }
            else{
                i++;
            }
            String newStr = "";
            for(int n=i; n<=j; n++){
                newStr = newStr + str.charAt(n);
            }
            System.out.println(newStr);
        }

    }
}