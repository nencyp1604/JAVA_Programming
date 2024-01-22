import java.util.Scanner;
public class CommandSum
{
    public static void main(String[] args)
    {
        System.out.println("Enter a Number: ");
        Scanner sc=new Scanner(System.in);
        double arr[]=new double[2];
        double add=0;
        for(int i=0;i<2;i++)
        {
            arr[i]=sc.nextDouble();
            add=add+arr[i];        
        }
        System.out.println("Sum is : "+add);
    }
}