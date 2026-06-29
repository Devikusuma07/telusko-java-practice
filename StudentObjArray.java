class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class StudentObjArray {
    public static void main(String[] args) {

        Student[] students = new Student[3];

        students[0] = new Student(1, "Ravi");
        students[1] = new Student(2, "Sita");
        students[2] = new Student(3, "Rahul");

        for(int i = 0; i < students.length; i++) {
            System.out.println(students[i].id + " " + students[i].name);
        }
    }
}