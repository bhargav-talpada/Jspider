class Demo3{
    int a = 10;
    int b = 20;
}

public class MainClass3 {
    public static void main(String[] args) {
        // declare & initalize onject
        Demo3 d1 = new Demo3();
        System.out.println("X = "+d1.a+ " b = "+d1.b);
        // modify values
        d1.a = 30;
        d1.b = 40;
        System.out.println("X = "+d1.a+ " b = "+d1.b);
        // re-initialize class type variable
        d1 = new Demo3();
        System.out.println("X = "+d1.a+ " b = "+d1.b);
        // re-initialize & modify class type variable
        d1 = new Demo3();
        d1.a = 50;
        d1.b = 60;
        System.out.println("X = "+d1.a+ " b = "+d1.b);
    }
}
