import java.util.Scanner;
class Area
{
    void circle(int r)
    {
        double area = Math.PI *r *r;
        System.out.println("Area = " +area);
    }
}
public class Circle_Area
{
    public static void main(String[] args)
    {
        Area a1= new Area();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value of r: ");
        int r=sc.nextInt();
        a1.circle(r);
    }
}
