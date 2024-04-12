public class HandleException
{
    public static void main(String[] args) 
    {
        try
        {
            int x=Integer.parseInt(args[0]);
            int y=Integer.parseInt(args[1]);
            int ans=x*y;
            for(int i=0;i<5;i++)
            {
                System.out.println("Ans - "+i+" = "+ans);
            }

        }
        catch(NumberFormatException e)
        {
            System.out.println("Number Format Exception.");
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exception.");
        }
        catch(IndexOutOfBoundsException e)
        {
            System.out.println("Index Out Of Bounds Exception.");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}