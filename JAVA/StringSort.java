/**
 * StringSort
 */
public class StringSort {

    public static void main(String[] args) {
        String str = "hello";
        char[] c = str.toCharArray();
        for(int i=0; i<c.length; i++){
            for(int j=0; j<c.length-1; j++){
                if (c[j] > c[j+1]) {
                    char t = c[j];
                    c[j] = c[j+1];
                    c[j+1] = t;
                }
            }
        }
        String newStr = new String(c);
        System.out.println(newStr);
    }
}