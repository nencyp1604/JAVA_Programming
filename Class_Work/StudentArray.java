import java.util.Scanner;
class Student 
{
    String name;
    String rollNo;

    public Student(String name,int rollNo)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Name of Student : ");
        this.name = sc.nextLine();
        System.out.println("Enter the Roll No. of Student : ");
        this.rollNo = sc.nextLine();
    }

    public void print()
    {
        System.out.println("Name = "+name+" Roll No. = "+rollNo);
    }
    
}

public class StudentArray 
{
    public static void main(String[] args)
    {
        Student[] stu =new Student[3];

        for(int i=0;i<stu.length;i++)
        {
            stu[i] = new Student(null,i);
        }
        for(int i=0;i<stu.length;i++)
        {
            stu[i].print();
        }
    }
}
