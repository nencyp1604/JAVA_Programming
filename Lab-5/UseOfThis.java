import java.util.Scanner;
class Student
{
    String name;
    Student()
    {
        name = "Nency";
    }
    Student(String name)
    {
        this.name=name;

        System.out.println("Name of Students are : "+this.name);
    }

}

public class UseOfThis 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Student's Name : ");
        String name = sc.next();  

        Student s1=new Student(name);
        System.out.println(s1.name);
        Student s2=new Student();
        System.out.println(s2.name);
    }
}
