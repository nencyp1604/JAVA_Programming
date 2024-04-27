import java.util.Scanner;
public class String2
{
    public static void main(String[] args)
    {
        System.out.println("Enter a String : ");
        Scanner sc=new Scanner(System.in);
        String temp=sc.nextLine();
        if(temp.trim().equals("nency"))
        {
            System.out.println("Valid User");
        }
        else
        {
            System.out.println("Invalid User");
        }
    }
}