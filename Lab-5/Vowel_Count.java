import java.util.Scanner;

class Vowel
{	

    int countV=0;
    int countC=0;
	public void countVowels(String str)
    {
        for (int j=0;j<str.length();j++) 
        {
            if(str.charAt(j)=='a'||str.charAt(j)=='e'||str.charAt(j)=='i'||str.charAt(j)=='o'||str.charAt(j)=='u'||str.charAt(j)=='A'||str.charAt(j)=='E'||str.charAt(j)=='I'||str.charAt(j)=='O'||str.charAt(j)=='U')
            {
                countV++;
            }
            else
            {
                countC++;
            }
        }
    }
}

public class Vowel_Count
{
	public static void main(String[] args) 
    { 
        
        Scanner sc = new Scanner(System.in);
        String str1 = "quit";
        int i=0;

        System.out.println("Just enter quit if you want to end the program...");
		
        Vowel v = new Vowel();
        while(i>=0)
        {
            System.out.print("Enter Sentence - " + (i+1) + " : ");		
            String str=sc.nextLine();
            if(str.equals(str1))
            {
                break;
            }
            else
            {
                
                v.countVowels(str);
            }
		    i++;
	    }
        
        System.out.println("Total Vowels used in all sentences are = "+v.countV);
        System.out.println("Total Consonants used in all sentences are = "+v.countC);
	
    }
}