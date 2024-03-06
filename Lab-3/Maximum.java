import java.util.Scanner;
public class Maximum
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st Number: ");
        int First_Num=sc.nextInt();
        System.out.println("Enter 2nd Number: ");
        int Sec_Num=sc.nextInt();
        System.out.println("Enter 3rd Number: ");
        int Third_Num=sc.nextInt();
        if(First_Num > Sec_Num)
        {
            if(First_Num > Third_Num)
            {
                System.out.println("First Number is Maximum."+First_Num);
            }
            else
            {
                if(Third_Num > Sec_Num)
                {
                    System.out.println("Third Number is Maximum."+Third_Num);
                }
            }
        }
        else
        {
            if(Sec_Num > Third_Num)
            {
                System.out.println("Second Number is Maximum."+Sec_Num);
            }
            else
            {
                System.out.println("Third Number is Maximum."+Third_Num);
            }
        }
    }
}