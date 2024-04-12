import java.io.*;
public class FileException
{
    public static void main(String[] args) 
    {
        String line;
        int read=0;
        int charRead=0;
        try
        {
            FileReader fr = new FileReader("./abc.txt");
            BufferedReader br = new BufferedReader(fr);
            while((line = br.readLine()) != null)
            {
                read++;
                charRead+=line.length();
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