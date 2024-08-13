public class Laptop {
    static int num = 101;
    final static String prefix = "LAP";
    final String model_num;
    String brand_nm;
    int year_of_menu;
    int price;

    public Laptop(String brand_nm, int year_of_menu, int price) {
        this.model_num = prefix + year_of_menu + brand_nm + num++;
        this.brand_nm = brand_nm;
        this.year_of_menu = year_of_menu;
        this.price = price;
    }

    void display(){
        System.out.println("Model Number: "+model_num+" Brand Name: "+brand_nm+" Year of Menufecture: "+year_of_menu+" Price: "+price);
    }
}
