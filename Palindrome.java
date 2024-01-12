import java.util.Scanner;
public class Palindrome
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int First_Num=sc.nextInt();
        int temp=First_Num;
        int Sum=0;
        int rem=0;
        while(First_Num != 0)
        {
            rem =First_Num%10;
            Sum=(Sum * 10)+rem;
            First_Num=First_Num/10;
        }
        System.out.println("First Number= "+First_Num);
        System.out.println("Sum= "+Sum);
        if(temp == Sum)
        {
            System.out.println("Number is Palindrome.");
        }
        else
        {
            System.out.println("Number is Not Palindrome.");
        }
    }
}