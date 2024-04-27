import java.util.Scanner;
class CustomException extends Exception 
{
    public CustomException(String message) 
    {
        super(message);
    }
}
class DataProcessor 
{
    public void processData(int value) throws CustomException 
    {
        if (value < 0) 
        {
            throw new CustomException("Negative values are not allowed.");
        } 
        else 
        {
            System.out.println("Processing data : " + value);
        }
    }
}
public class Main 
{
    public static void main(String[] args) 
    {
        DataProcessor processor = new DataProcessor();
        System.out.println("Enter a Value : ");
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        try 
        {
            processor.processData(data);
        } 
        catch (CustomException e) 
        {
            System.out.println("Error : " + e.getMessage());
        }
    }
}
