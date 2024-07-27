class Demo2{
    int x = 10;
    int y = 20;
}
public class MainClass2 {
    public static void main(String[] args) {
        // declare & initilize multiple object
        Demo2 d1 = new Demo2(); 
        Demo2 d2 = new Demo2();
        System.out.println("x = "+d1.x + " y = "+d1.y);
        System.out.println("x = "+d2.x + " y = "+d2.y);
        // modify d1 non-static members
        d1.x = 30;
        d1.y = 40;
        System.out.println("x = "+d1.x + " y = "+d1.y);
        // modify d2 non-static members
        d2.x = 50;
        d2.y = 60;
        System.out.println("x = "+d2.x + " y = "+d2.y);
    }
}
