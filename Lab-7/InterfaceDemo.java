interface A
{
    int a=10;
    void ma();
}
interface A1 extends A
{
    int a1=12;
    void ma1();
}
interface A2 extends A
{
    int a2=20;
    void ma2();
}
interface A12 extends A1,A2
{
    int a12=30;
    void ma12();
}
class B implements A12
{
    public void ma()
    {
        System.out.println("Value of a = "+a);
    }
    public void ma1()
    {
        System.out.println("Value of a1 = "+a1);
    }
    public void ma2()
    {
        System.out.println("Value of a2 = "+a2);
    }
    public void ma12()
    {
        System.out.println("Value of a12 = "+a12);
    }
}

public class InterfaceDemo 
{
    public static void main(String[] args) 
    {
        B b = new B();
        b.ma();
        b.ma1();
        b.ma2();
        b.ma12();
    }    
}
