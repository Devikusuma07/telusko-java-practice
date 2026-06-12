class Student
{
    private String name;
    private int marks;

    public void setData(String n, int m) 
    {
        name = n;
        marks = m;

    }

    void display()
    {
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }


}



public class PrVarPbMethod {
    public static void main(String[] args) {
        Student s1  = new Student();

        s1.setData("Devi", 98);
        s1.display();
    }
    
}
