class Emp{
    String name;
    int id;

    void display(){
        System.out.println("Name: " + name);
        System.out.println("Id: " + id);
        System.out.println();
    }
}

public class TwoObjects {
    public static void main(String[] args) {

        Emp e1 = new Emp();
        e1.name = "Kusu";
        e1.id = 12;

        Emp e2 = new Emp();
        e2.name = "Devi";
        e2.id = 45;
        
        e1.display();
        e2.display();
        
    }
    
}
