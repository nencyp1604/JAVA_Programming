import java.util.Scanner;
public class Circle_area
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a value of r: ");
        double r=sc.nextInt();
        System.out.println((Math.PI*r*r));
    }
}