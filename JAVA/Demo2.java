public class Demo2 {
    public static void main(String[] args) {
        System.out.println(Demo3.x);
        System.out.println(Demo3.y);
        System.out.println("Re-Initlization of Variables");
        Demo3.x = 30;
        Demo3.y = 40;
        System.out.println(Demo3.x);
        System.out.println(Demo3.y);
        Demo3.test();
    }
}
class Demo3 {
    static int x = 50;
    static int y = 60;
    static void test(){
        System.out.println("Bhargav Talpada");
    }
}
