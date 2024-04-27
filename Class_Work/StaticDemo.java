class WebSite
{
    static int noOfVisitor=0;
    public static void  addCount()
    {
        noOfVisitor++;
        System.out.println(noOfVisitor);
    }
}


public class StaticDemo
{
      
    public static void main(String[] args)
    {
      
        System.out.println("My main method.");
    }
    static
        {
            System.out.println("My static block");
        }
}
