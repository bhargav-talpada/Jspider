public class Employee {
    static int num = 1001;
    final String prefix = "Infosys";
    String id;
    String name;
    int salary;
    double experience;

    public Employee(String name, int salary, double experience) {
        this.id = prefix + num++;
        this.name = name;
        this.salary = salary;
        this.experience = experience;
    }
    
    void display(){
        System.out.println("Employee Id: "+id+" Employee Name: "+name+" Employee Salary: "+salary+" Employee Experience: "+experience);
    }

}