import java.util.Scanner;
public class Average_of_value
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number : ");
        
        int arr[]=new int[4];
        int sum=0;
        for(int i=0;i<4;i++)
        {
            arr[i]=sc.nextInt();
            sum=sum+arr[i];
        }
        double avg=sum/4.0;
        System.out.println("Average of numbers is = "+avg);
    }
}