public class TypeConversion {

    void sum (int... args){
        int sum = 0;
        for(int i=0; i<args.length; i++){
            sum = sum + args[i];
        }
        System.out.println(sum);
    } 
    public static void main(String[] args) {
        // implicit type conversion
        int a = 10;
        double b = a;
        System.out.println(b);

        // explicit type conversion
        double d = 10.0;
        int aa = (int) d;
        System.out.println(aa);

        // VAR ARGS
        TypeConversion tc = new TypeConversion();
        tc.sum(10,20,30);
        tc.sum(14,15,16,17);
        tc.sum();
    }
}
