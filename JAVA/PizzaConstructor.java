public class PizzaConstructor {

    String type = "Regular";
    int price = 150;
    String toping1, toping2;
    boolean cheese;

    PizzaConstructor(boolean c){
        this.cheese = c;
        if (c == true) {
            this.price = this.price + 40;
        }
    }
    PizzaConstructor(String t1 ,boolean c){
        this.cheese = c;
        this.toping1 = t1;
        this.price = this.price + 30;
        if (c == true) {
            this.price = this.price + 40;
        }
    }
    PizzaConstructor(String t1, String t2, boolean c){
        this.cheese = c;
        this.toping1 = t1;
        this.toping2 = t2;
        this.price = this.price + 50;
        if (c == true) {
            this.price = this.price + 40;
        }
    }
    public static void main(String[] args) {
        PizzaConstructor p1 = new PizzaConstructor("Paneer", "Corn" ,true);
        System.out.println("Pizza Type : "+ p1.type);
        System.out.println("Extra Toping 1 : "+ p1.toping1);
        System.out.println("Extra Toping 2 : "+ p1.toping2);
        System.out.println("Extra Cheese : "+ p1.cheese);
        System.out.println("Pizza Price : "+ p1.price);
    }
}
