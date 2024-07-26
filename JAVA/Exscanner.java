import java.util.Scanner;

public class Exscanner {

    public static void printData(String nm, int a, char g){
        System.out.println("Your Name is : "+ nm);
        System.out.println("Your Age is : "+ a);
        System.out.println("You are a : "+ g);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name : ");
        String name = sc.nextLine();
        System.out.println("Enter Your Age : ");
        int age = sc.nextInt();
        System.out.println("Enter Your Name : ");
        char gen = sc.next().charAt(0);
        printData(name, age, gen);
    }
}
