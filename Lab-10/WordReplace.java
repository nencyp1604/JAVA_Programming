import java.io.*;
import java.util.Scanner;
public class WordReplace 
{
    public static void main(String[] args) 
    {
        String line;
        int read=0;
        int charRead=0;
        int word=0;
        try
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a String : ");
            String word1 = sc.next();
            System.out.println("Enter a String : ");
            String word2 = sc.next();
            FileReader fr = new FileReader("./abc.txt");
            BufferedReader br = new BufferedReader(fr);
            while((line = br.readLine()) != null)
            {
                read++;
                charRead+=line.length();
                String[] w=line.split(" ");
                word+=w.length;
                for(int i=0;i<w.length;i++)
                {
                    if(word1.equals(w[i]))
                    {
                        w[i] = word2;
                    }
                }
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        System.out.println("Line of File = "+read);
        System.out.println("Character of File = "+charRead);
    }
}    

