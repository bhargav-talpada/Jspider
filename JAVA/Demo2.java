public class Demo2 {
    public static void main(String[] args) {
        System.out.println(DemoM.x);
        System.out.println(DemoM.y);
        System.out.println("Re-Initlization of Variables");
        DemoM.x = 30;
        DemoM.y = 40;
        System.out.println(DemoM.x);
        System.out.println(DemoM.y);
        DemoM.test();
    }
}
class DemoM {
    static int x = 50;
    static int y = 60;
    static void test(){
        System.out.println("Bhargav Talpada");
    }
}
