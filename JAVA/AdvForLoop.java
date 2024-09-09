public class AdvForLoop {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 50, 70, 100};
        int sum = 0;
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        for(int ele : arr){
            sum += ele;
        }
        System.out.println(sum);
    }
}
