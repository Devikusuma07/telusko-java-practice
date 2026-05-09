class Computer
{
    public void PlayMusic()
    {
        System.out.println("Playing music....");
    }

    public String getMeAPen(int cost)
    {
        if(cost >= 10)
        {
            return  "pen";
        }
        return "Nothing.....";
    }
}
public class Methods {
    public static void main(String[] args) {
        
        Computer c1 = new Computer();

        c1.PlayMusic();
        String str = c1.getMeAPen(15);
        System.out.println(str);
    }
    
}
