import java.util.Scanner;
public class Digit_sum 
{
    public static void main(String[] args) 
    {
        int n,rem,sum=0;
        System.out.println("Enter a Number : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        while (n>0) 
        {
            rem=n%10;
            sum=sum+rem;
            n=n/10;    
        }
        System.out.println("Sum Of Digits is = "+sum);
    }
}
