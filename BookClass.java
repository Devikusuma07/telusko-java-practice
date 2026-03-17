class Book
{
    String Title;
    String Author;

    void display()
    {
        System.out.println("Book Title : " + Title);
        System.out.println("Book Author : " + Author);
    }
    
}


public class BookClass {
    public static void main(String[] args) {
        
        Book b1 = new Book();

        b1.Title = "Java Basics";
        b1.Author = "Devi";

        b1.display();
    }
    
}
