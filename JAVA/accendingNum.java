public class accendingNum {
    public static void main(String[] args) {
        int n = 1234567;
        int count = 0;
        int rem1;

        int rem2;
        while(n!=0){
            rem1=n%10;
            n=n/10;
            rem2=n%10;
            if(rem2>rem1){
                count=count+1;
            }
        }
        System.out.println(count>0?"No":"Yes");


        
        }
        
    
}
