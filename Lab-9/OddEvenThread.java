class Even extends Thread
{
    public void run()
    {
        try
        {
            for(int i=0;i<20;i++)
            {
                if(i%2 == 0)
                {
                    System.out.println("Even Number = "+i);
                }
                    Thread.sleep(500);
            }  
        }
        catch(Exception e)
        {

        }
    }
}
class Odd extends Thread
{
    public void run()
    {
        try
        {
            for(int i=0;i<20;i++)
            {
                if(i%2 != 0)
                {
                    System.out.println("Odd Number = "+i);   
                }
                Thread.sleep(500);
            }
        }
        catch(Exception e)
        {

        }
    }
}

public class OddEvenThread 
{
    public static void main(String[] args) 
    {
        Even e = new Even();
        Odd o = new Odd();
        e.start();
        o.start();
    }    
}
