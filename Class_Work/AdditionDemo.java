class Addition
{
    public int max(int n1,int n2)
    {
        if(n1>n2)
        {
            return n1;
        }
        else
        {
            return n2;
        }
    }
    public int max(int n1, int n2, int n3)
    {
        int temp=max(n1,n2);
        int ans = max(temp,n3);
        return ans;
    }
}
public class AdditionDemo
{
    public static void main(String[] args)
    {
        Addition ad=new Addition();
        int ans = ad.max(19,25,34);
        System.out.println("Answer = "+ans);
    }
}