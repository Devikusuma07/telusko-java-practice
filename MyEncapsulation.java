class Human {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int a) {
        age = a;
    }

    public void setName(String n) {
        name = n;
    }
}

public class MyEncapsulation {
    public static void main(String[] args) {

        Human obj = new Human();

        obj.setAge(16);
        obj.setName("Devi");
        //obj.getAge();
        //obj.getName();
        
    }
    
}
