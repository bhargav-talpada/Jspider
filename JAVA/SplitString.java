public class SplitString {
    public static void main(String[] args) {
        String s1 = "hi hello bye welcome";
        String[] arr1 = s1.split(" ");
        for(int i=0; i<arr1.length; i++){
            System.out.println(arr1[i]);
        }
        System.out.println("================");
        String s2 = "hi@ hel@lo by@e welc@ome";
        String[] arr2 = s2.split("@");
        for(int i=0; i<arr2.length; i++){
            System.out.println(arr2[i]);
        }
    }
}
