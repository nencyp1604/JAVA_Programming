import java.util.*;
public class IfElse
{
    public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter marks: ");
      double marks=sc.nextInt();

        if (marks < 60) 
        {
        	System.out.println("Fail");
        } 
        else if (marks >= 60 && marks < 80) 
        {
        	System.out.println("B grade");
        } 
        else if (marks >= 80 && marks < 90) 
        {
        	System.out.println("A grade");
        } 
        else if (marks >= 90 && marks < 100) 
        {
        	System.out.println("A+ grade");
        } 
        else 
        {
        	System.out.println("Invalid!");
        }
    }
}
