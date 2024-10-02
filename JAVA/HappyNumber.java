// 19-->1+81-->82 -> 64+4 -> 68 -> 36+64 -> 100 -> 1
public class HappyNumber {

    static int isHappy(int n){
        int rem=0,sum=0;
        while(n!=0){
            rem=n%10;
            sum=sum+(rem*rem);
            n=n/10;
        }
        return sum;
    }
    public static void main(String[] args) {
       int num=19;
       int temp=0;
       while(num>9){
        temp=isHappy(num);
        num=temp;
       }
       System.out.println(num);
       System.out.println(num==1?"Happy":"Not Happy");
    }
}
