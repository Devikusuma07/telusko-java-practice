class Employee {
    String name;
    double basicSal;
    double hra;
    double da;

    double calSal() {
        return basicSal + hra + da;
    }

    void display() {
        System.out.println("Name : " + name);
        System.out.println("Basic Salary : " + basicSal);
        System.out.println("HRA : " + hra);
        System.out.println("DA : " + da);
        System.out.println("Gross Salary : " + (basicSal + hra + da));
    }
}

public class CalculateSalClass {
    public static void main(String[] args) {

        Employee e1 = new Employee();

        e1.name="kusuma";
        e1.basicSal = 5000000.0;
        e1.hra = 5000.0;
        e1.da=2000.0;

        e1.display();
    }
    
}
