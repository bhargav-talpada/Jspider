// public class nearest_prime {
//      static boolean isPrime(int n){
//         int count=0;
//         for(int i=1;i<=n;i++){
//             if(n%i==0){
//                 count++;
//             }
//         }
//         return count==2;
//      }

//     public static void main(String[] args) {
//         int n=25;
//         int prev=n-1,next=n+1;

// }

public class nearest_prime {

    static boolean isPrime(int n) {
        int count = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if(count==1){
            return true;
        }else{
            return false;
        }

    }

    public static void main(String[] args) {
        int num=50;
        int l=num-1;
        int h=num+1;
        int nearestVal=0;
        while(num!=0){
            if(isPrime(num)==true){
                nearestVal=num;
                break;
            }
            if(isPrime(l)==true){
                nearestVal=l;
                break;
            }
            if(isPrime(h)==true){
                nearestVal=h;
                break;
            }
            l=l-1;
            h=h-1;

        }
        System.out.println(nearestVal);
        
    }

}
