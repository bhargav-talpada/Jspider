public class EmployeeMainClass {
    public static void main(String[] args) {
        Employee e1 = new Employee("Bhargav", 200000, 1.5);
        Employee e2 = new Employee("Parth", 210000, 2);
        Employee e3 = new Employee("Ashish", 250000, 2.5); 
        e1.display();
        e2.display();
        e3.display();
    }
}
