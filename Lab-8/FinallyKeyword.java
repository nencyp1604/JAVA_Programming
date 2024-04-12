import java.util.Scanner;
public class FinallyKeyword 
{
    public static void main(String[] args) 
    {
        double  c=1;
        try
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a Value of a : ");
            double a = sc.nextDouble();
            System.out.println("Enter a Value of b : ");
            double b = sc.nextDouble();
            c = a/b;
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("Ans = "+c);
        }
    }    
}
