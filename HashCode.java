 class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class HashCode {

    public static void main(String[] args) {

        Student s1 = new Student(1, "Devi");
        Student s2 = new Student(1, "Devi");

        System.out.println("HashCode of s1: " + s1.hashCode());
        System.out.println("HashCode of s2: " + s2.hashCode());
    }
    
}
