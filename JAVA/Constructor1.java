public class Constructor1 {
    String name;
    int age;
    Constructor1(String nm, int a){
        // System.out.println(this);
        this.name = nm;
        this.age = a;
    }
    public static void main(String[] args) {
        Constructor1 c1 = new Constructor1("Bhargav", 21);
        System.out.println(c1.name);
        System.out.println(c1.age);
    }    
}