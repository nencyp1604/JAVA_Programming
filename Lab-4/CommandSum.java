import java.util.Scanner;
public class CommandSum
{
    public static void main(String[] args)
    {
        System.out.println("Enter a Number: ");
        Scanner sc=new Scanner(System.in);
        double arr[]=new double[2];
        double sum=0;
        for(int i=0;i<2;i++)
        {
            arr[i]=sc.nextDouble();
            sum=sum+arr[i];        
        }
        System.out.println("Sum is : "+sum);
    }
}