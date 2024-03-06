import java.util.Scanner;

class Bank_Account
{
    int accountNo;
    String userName;
    String email;
    String accountType;
    double accountBalance;

    public void getAccountDetails()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Account No. : ");
        accountNo = sc.nextInt();
        System.out.println("Enter a Username : ");
        userName = sc.next();
        System.out.println("Enter an E-mail : ");
        email = sc.next();
        System.out.println("Enter Your Account Type : ");
        accountType = sc.next();
        System.out.println("Enter Your Account Balance : ");
        accountBalance = sc.nextDouble(); 
    }

    public void displayAccountDetails()
    {
        System.out.println("Your Account no. is : "+accountNo);
        System.out.println("Your Username is : "+userName);
        System.out.println("Your E-mail is : "+email);
        System.out.println("Your Account Type is : "+accountType);
        System.out.println("Your Account Balance is : "+accountBalance);
    }
}

public class Bank 
{
    public static void main(String[] args) 
    {
        Bank_Account b = new Bank_Account();
        b.getAccountDetails();
        b.displayAccountDetails();
    }    
}
