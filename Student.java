class College {

    public String student(String name, String Roll) {
        return "Name: " + name + " Roll: " + Roll;

    }
}

public class Student {
    public static void main(String[] args) {
        College c1 = new College();

        String result = c1.student("Devi Kusuma", "675gd78");

        System.out.println(result);
    }

    
}
