import java.util.Scanner;
public class Second_half
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str=sc.next();
        int x=str.length();
        int half=x/2;
        System.out.println("Half of String is : "+half);
        System.out.println("Letters Of Half String is : ");
        for(int i=half;i<x;i++)
        {
            System.out.print(str.charAt(i));
        }
    }
}