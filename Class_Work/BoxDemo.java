import java.util.Scanner;
class Box
{
    int height;
    int breadth;
    int length;
    Box()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Height : ");
        int h= sc.nextInt();
        
        System.out.println("Enter Breadth : ");
        int b = sc.nextInt();
      
        System.out.println("Enter Length : ");
        int l = sc.nextInt();

       
        int vol = h*b*l;
        System.out.println("Volume = "+vol);
    }
}
public class BoxDemo
{
    public static void main(String[] args)
    {
        System.out.println("For Box-1 :");
        Box myBox1 = new Box();
        System.out.println("For Box-2 : ");
        Box myBox2 = new Box();
    }
}