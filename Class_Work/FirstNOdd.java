import java.util.Scanner;
public class FirstNOdd
{
    public static void main(String[] args)
    {
        System.out.println("Enter a Number: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n*2;i+=2)
        {
            //if(i%2==1)
           System.out.println(i);
        }
    }
}