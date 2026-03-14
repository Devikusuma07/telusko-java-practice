class Student
{
    String name;
    int marks;

    void display()
    {
        System.out.println("Name : " + name + " Marks : " + marks);
    }
}


public class ArrayObjects {
    public static void main(String[] args) {

        Student[] students = new Student[3];

        students[0] = new Student();
        students[1] = new Student();
        students[2] = new Student();

        students[0].name = "Alice";
        students[0].marks = 85;

        students[1].name = "Bob";
        students[1].marks = 90;

        students[2].name = "Charlie";
        students[2].marks = 95;

        for (Student student : students) {
            student.display();
        }
    }
}

