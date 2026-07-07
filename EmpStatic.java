

class Employee {
    String name;
    double salary;
    static String company = "Google";
    public void show()
    {
        System.out.println(" Name: " + name + "  Salary: " + salary + " Company: " + company);
    }
}

public class EmpStatic {
    public static void main(String args[]) {
        Employee e1 = new Employee();
        e1.name = "Devi";
        e1.salary = 1400;

       Employee e2 = new Employee();
        e2.name = "kusuma";
        e2.salary = 140000000;

        Employee e3 = new Employee();
        e3.name = "mucky";
        e3.salary = 14000;

        e1.show();
        e2.show();
        e3.show();

    }
    
}
