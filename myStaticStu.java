class Student {
    String name;
    static int count = 0;

    public Student(String name) {
        this.name = name;
        count++;

        System.out.println("Name of the student: " + name);
        System.out.println("The Student count: " + count);
        System.out.println();
    }
}


public class myStaticStu {
    public static void main(String[] args) {
        Student s1 = new Student("Devi");
        Student s2 = new Student("Kusuma");
        Student s3 = new Student("Lucky");

    }
    
}
