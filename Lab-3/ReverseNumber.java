import java.util.Scanner;
public class ReverseNumber 
{
    public static void main(String[] args) 
    {
        int n,rem;
        System.out.println("Enter a Number : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.print("Number in Reverse Order : ");

        while (n>0) 
        {
            rem=n%10;
            System.out.print(rem);
            n=n/10;
        }
    }
}
