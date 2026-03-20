class calNum
{
    float num1;
    float num2;

    void display()
    {
        System.out.println("Number 1 : " + num1);
        System.out.println("Number 2 : " + num2);
    }
}

class Test 
{
    void add(calNum c)
    {
        System.out.println("Addition : " + (c.num1 + c.num2));
    }

    void sub(calNum c)
    {
        System.out.println("Subtraction : " + (c.num1 - c.num2));
    }

    void div(calNum c)
    {
        if(c.num1  != 0 && c.num2 != 0 && c.num2 < c.num1) 
        {
            System.out.println("Division : " + (c.num1 / c.num2));
        }
        else 
        {
            System.out.println("Division is not possible");
        }

    }

    void mul(calNum c)
    {
        System.out.println("Multiplication : " + (c.num1 * c.num2));
    }

}

public class CalculatorClass {
    public static void main(String[] args) {
        
        calNum c1 = new calNum();

        c1.num1 = 10.0f;
        c1.num2 = 5.0f;

        Test t1 = new Test();

        t1.add(c1);
        t1.sub(c1);
        t1.div(c1);
        t1.mul(c1);
    
    }
    
}
