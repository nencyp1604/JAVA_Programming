import java.util.Scanner;

class Square
{
    void area(int l)
    {
        double area = l*l;
        System.out.println("Area Of Square = "+area);
    }
}

public class Square_Area 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value of l: ");
        Square s=new Square();
        int l =sc.nextInt();
        s.area(l);
    }
}
