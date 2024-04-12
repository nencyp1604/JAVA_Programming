class Morning implements Runnable
{
    public void run()
    {
        try
        {
            for(int i=0;i<20;i++)
            {
                    System.out.println("Good Morning");
               
                    Thread.sleep(1000);
            }  
        }
        catch(Exception e)
        {

        }
    }
}
class Afternoon implements Runnable
{
    public void run()
    {
        try
        {
            for(int i=0;i<20;i++)
            {
                System.out.println("Good Afternoon");
                Thread.sleep(3000);
            }  
        }
        catch(Exception e)
        {

        }
    }
}

public class GoodMorningRunnable 
{
    public static void main(String[] args) 
    {
        Morning m = new Morning();
        Thread e1  = new Thread(m);
        Afternoon a = new Afternoon();
        Thread e2 = new Thread(a);
        e1.start();
        e2.start();
    }
}
