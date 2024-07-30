class Obj1{
    int x = 10;
    int y = 20;
}

public class MainClass1 {
    public static void main(String[] args) {
        Obj1 d1 = new Obj1(); // declare & initialize the object...
        System.out.println("X = " + d1.x); // access non-static variable/members
        System.out.println("Y = " + d1.y);
        d1.x = 30;  // modify the non-static variables...
        d1.y = 40;
        System.out.println("X = " + d1.x);
        System.out.println("y = " + d1.y);
    }
}
