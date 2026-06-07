

class Student
{
    String name;
    int marks;

    void display()
    {
        System.out.println("Name : " + name);
        System.out.println("Marks : " + marks);
    }

}

class Result 
{
    void checkResult(Student s)
    {
        if(s.marks >= 35) {
            System.out.println(s.name + " pass");
        }
        else {
            System.out.println(s.name + " fail");
        }
    }
}

public class PassObject {
    public static void main(String[] args) {
        
        Student s1 = new Student();

        s1.name = "Devi";
        s1.marks = 80;

        Result r1 = new Result();
        r1.checkResult(s1);
 
        }
}
