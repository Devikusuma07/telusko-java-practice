class Person 
{
    private String name = "Dev";
    private int age;

    public String getName(){
        return name;
    }

    public void setAge(int a) {
        age = a;
    }
}

public class MyEnCaPerson {
    public static void main(String[] args) {

        Person p1 = new Person();

        p1.setAge(57);
        System.out.println(p1.getName());
        
    }
}
