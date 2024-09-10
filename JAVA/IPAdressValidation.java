public class IPAdressValidation {
    public static void main(String[] args) {
        String str = "123.44.56.213";
        String[] arr = str.split("[.]");
        if(arr.length == 4){
            boolean flag = true;
            for(String ele : arr){
                int n = Integer.parseInt(ele);
                if (n<0 || n>255) {
                    flag = false;
                    break;
                }
            }
            System.out.println(flag==true?"Valid IP" : "Invalid IP");
        }
        else{
            System.out.println("Invalid IP");
        }
    }
}
