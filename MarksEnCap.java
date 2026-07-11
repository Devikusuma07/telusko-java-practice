class Marks{
    private int marks;

    public void setMarks(int m) {
        marks = m;
    }
    public int getMarks(){
        return marks;
    }
}

public class MarksEnCap {
    public static void main(String[] args) {
        Marks m1 = new Marks();

        m1.setMarks(89);

        System.out.println(m1.getMarks()); 
    }
    
}
