import java.util.Scanner;

class Complex
{
    int a;
    int b;

    Complex()
    {
        this.a=10;
        this.b=20;
    }
    Complex(int a1,int b1)
    {
        this.a = a1;
        this.b = b1;
    }
    void add(Complex c)
    {
        int a3 = this.a + c.a;
        int b3 = this.b + c.b; 

        System.out.println("Addition Of Complex Number is = "+a3+" + i ("+b3+")");
    } 
    
    
}

public class ComplexNumber 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Value of a : ");
        int a = sc.nextInt();
        System.out.println("Enter a Value of b : ");
        int b = sc.nextInt();

        Complex c1 = new Complex();
        Complex c2 = new Complex(a,b);
        c1.add(c2);
    }    
}
