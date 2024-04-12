import java.io.BufferedReader;
import java.io.FileReader;

class Student
{
    String name;
    int age;
    Student(String n,int a)
    {
        this.name = n;
        this.age = a;
    }
    public String toString()
    {
        return name+" "+age;
    }
} 

public class bufferedReader 
{
    public static void main(String[] args) 
    {
        try
        {
            BufferedReader br = new BufferedReader(new FileReader("../Lab-10/a.txt"));
            String line;
            while((line = br.readLine()) != null)
            {
                String arr[] = line.split(" ");
                String name = arr[0];
                int age = Integer.parseInt(arr[1]);
                Student s1 = new Student(name, age);
                System.out.println(s1);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }    
    }    
}
