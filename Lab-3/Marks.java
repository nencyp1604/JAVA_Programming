import java.util.Scanner;
public class Marks
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a marks: ");
        int mark1=sc.nextInt();
        
        System.out.println("Enter a marks: ");
        int mark2=sc.nextInt();
        
        System.out.println("Enter a marks: ");
        int mark3=sc.nextInt();

        System.out.println("Enter a marks: ");
        int mark4=sc.nextInt();
       
        System.out.println("Enter a marks: ");
        int mark5=sc.nextInt();
        double sum=(mark1 + mark2 + mark3 + mark4 + mark5)/5.0;
        System.out.println("Sum="+sum);
        if(sum>=60)
        {
            System.out.println("First Division");
        }
        else if(sum<=59 && sum>=50)
        {
            System.out.println("Second Division");
        }
        else if(sum<=49 && sum>=40)
        {
            System.out.println("Third Division");
        }
        else if(sum<40)
        {
            System.out.println("Fail");
        }
        else
        {
            System.out.println("Please Enter Correct Marks.");
        }
    }
}