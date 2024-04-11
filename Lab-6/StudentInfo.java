import java.util.Scanner;

class Student
 {
    int id_no;
    int no_of_subjects;
    String [] subject_code;
    int [] subject_credit;
    String [] grade_obtained;
    double spi;

    public Student()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID Number : ");
        id_no = sc.nextInt();
        System.out.println("Enter Number Of Subjects : ");
        no_of_subjects = sc.nextInt();
        subject_code = new String[no_of_subjects];
        subject_credit = new int[no_of_subjects];
        grade_obtained = new String[no_of_subjects];

        for(int i=0;i<no_of_subjects;i++)
        {
            System.out.println("Enter Subject Code for subject no "+(i+1));
			   subject_code[i] = sc.next();
            System.out.println("Enter Subject Credit for Subject no "+(i+1));
            subject_credit[i] = sc.nextInt();
            System.out.println("Enter Obtained Grade for Subject : ");
            grade_obtained[i] = sc.next();
        }
    }

    public void calculateSPI()
    {
        int creditsum=0;
        int sum=0;
        for(int i=0;i<no_of_subjects;i++)
        {
            creditsum += subject_credit[i];
            if(grade_obtained[i].equals("A"))
            {
               sum = sum + (subject_credit[i] * 10);
            }
            else if(grade_obtained[i].equals("A"))
            {
               sum = sum + (subject_credit[i] * 9);
            }
            else if(grade_obtained[i].equals("B+"))
            {
               sum = sum + (subject_credit[i] * 8);
            }
            else if(grade_obtained[i].equals("B"))
            {
               sum = sum + (subject_credit[i] * 7);
            }
            else if(grade_obtained[i].equals("C+"))
            {
               sum = sum + (subject_credit[i] * 6);
            }
            else if(grade_obtained[i].equals("C"))
            {
               sum = sum + (subject_credit[i] * 5);
            }
            else if(grade_obtained[i].equals("D+"))
            {
               sum = sum + (subject_credit[i] * 4);
            }
            else if(grade_obtained[i].equals("E"))
            {
               sum = sum + (subject_credit[i] * 3);
            }
            else
            {
               sum = sum + (subject_credit[i] * 2);
            }
        }
        spi = sum / creditsum;

    }
 }

public class StudentInfo 
{
   public static void main(String[] args) 
   {
      Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of students");
		int n = sc.nextInt();

      Student [] s = new Student[n];

      for(int i=0;i<n;i++)
      {
		   s[i] = new Student();
	   }

      for(int i=0;i<n;i++)
      {
         s[i].calculateSPI();
      }

      for(int i=0;i<n;i++)
      {
         System.out.println("SPI of student - ID "+s[i].id_no +" = "+s[i].spi);
      }
   } 
}
