import java.util.Scanner;
public class Length_of_string
{
    public static void main(String[] args)
    {
        System.out.println("Enter a String : ");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int n=str.length();
        for(int i=n/2;i<=n-1;i++)
        {
            System.out.print(""+str.charAt(i));
        }
    }
}