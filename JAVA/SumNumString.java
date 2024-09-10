import java.util.regex.Pattern;

public class SumNumString {
    public static void main(String[] args) {
        String str = "hello 123 hi 10 bye 80";
        String[] arr = str.split(" ");
        int sum = 0;
        for(String ele : arr){
            if (Pattern.matches("[0-9]*", ele)) {
                int n = Integer.parseInt(ele);
                sum = sum + n;
            }
        }
        System.out.println(sum);
    }
}
