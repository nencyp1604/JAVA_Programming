import java.io.*;
public class DecreptImage{
	public static void main(String[] args) {
		try{
			FileInputStream fis = new FileInputStream("/Users/nencyparmar/Downloads/DU_Logo.svg");
			fis.skip(4999);
			int length = fis.read();
			for(int i=0;i<length;i++){
				System.out.println((char)fis.read());	
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}