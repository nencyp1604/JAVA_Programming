import java.io.*;
class Student
{
    String name;
    int age;

    Student(String name , int age)
    {
        this.name = name;
        this.age = age;
    }
}

public class StudentManager 
{
    public static void main(String[] args) 
    {
        String fileName = "../Lab-10/b.txt";
        try
        {
            DataInputStream dis = new DataInputStream(new FileInputStream("../Lab-10/b.txt"));
            while(dis.available()>0)
            {
                String name = dis.readUTF();
                int age = dis.readInt();
                Student student = new Student(name, age);
                System.out.println(student);
            }
            dis.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

        try
        {
            DataOutputStream dos  = new DataOutputStream(new FileOutputStream("../Lab-10/b.txt"));
            dos.writeUTF("\nNency");
            dos.writeInt(18);
            dos.writeUTF("\nPriya");
            dos.writeInt(19);
            System.out.println("Data Written Successfully.");
            dos.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }    
}
