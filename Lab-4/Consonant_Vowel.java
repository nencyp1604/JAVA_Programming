import java.util.Scanner;
public class Consonant_Vowel
{
    public static void main(String[] args)
    {
        System.out.println("Enter a String : ");
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int n=str.length();
        int v_count=0 ,c_count=0;
        for(int i=0;i<=n-1;i++)
        {
            if(str.charAt(i) =='a'|| str.charAt(i) =='e' || str.charAt(i) =='i' || str.charAt(i) =='o' || str.charAt(i) =='u'|| str.charAt(i) =='A'|| str.charAt(i) =='E'|| str.charAt(i) =='I'|| str.charAt(i) =='O'|| str.charAt(i) =='U' )
            {
                v_count++;
            }
            else
            {
                c_count++;
            }
        }
        System.out.println("Numbers Of Vowels are : "+v_count);
        System.out.println("Numbers Of Consonants are "+c_count);
    }
}