import java.util.Scanner;
public class Binary
{
    public static void main(String[] args)
    {
        int[] arr = {1,2,5,8,15,28,35,48,55,61,100};
        int high = arr.length;
        int low = 0;
        int mid = (high + low)/2;
        System.out.println("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        boolean isFound=false;
        while(high>=low)
        {
            System.out.println("high : "+high);
            System.out.println("low : "+low);
            System.out.println("mid : "+mid);
            if(n<arr[mid])
            {
                high=mid-1;
            }
            else if(n==arr[mid])
            {
                System.out.println("Found the number at : "+mid);
                break;
            }
            else
            {
                low=mid+1;
            }
            mid=(high+low)/2;
            if(!isFound)
            {
                System.out.println("Number is not found.");
            }
        }
    }
}