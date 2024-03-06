import java.util.Scanner;
public class Reverse_Order
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Size of array : ");        
        int n=sc.nextInt();
        System.out.println("Enter a Number : ");
        int arr[]=new int[n];
        for(int i=0;i<(arr.length);i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=n-1;i>=0;i--)
        {            
            System.out.println("Array in Reverse Order : "+arr[i]);
        }
    }
}