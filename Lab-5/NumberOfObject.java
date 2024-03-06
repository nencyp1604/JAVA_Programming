class Object
{
    static int countOfObject=0;

    Object()
    {
        countOfObject++;
    }
}

public class NumberOfObject 
{
    public static void main(String[] args) 
    {
        Object o1 = new Object();
        Object o2 = new Object();
        Object o3 = new Object();
        Object o4 = new Object();
        Object o5 = new Object();
        Object o6 = new Object();
        Object o7 = new Object();

        System.out.println("Number Of Object is = "+Object.countOfObject);
    }    
}
