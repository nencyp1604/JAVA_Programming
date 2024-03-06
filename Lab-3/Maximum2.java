import java.util.Scanner;
public class Maximum2
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st Number: ");
        int a=sc.nextInt();
        System.out.println("Enter 2nd Number: ");
        int b=sc.nextInt();
        System.out.println("Enter 3rd Number: ");
        int c=sc.nextInt();
        int Max=(a>b)?((a>c)?a:c):((b>c)?b:c);
        System.out.println("Maximum Number is = "+Max);
    }
}