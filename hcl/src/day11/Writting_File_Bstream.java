package day11;

import java.io.*;
import java.util.Scanner;

public class Writting_File_Bstream {

	public static void main(String[] args)  {
		
		//byte b[]=new byte[100];
		OutputStream fout=null;
		String str;
		try {
			//System.in.read(b);
			Scanner s=new Scanner(System.in);
			str=s.nextLine();
			fout=new FileOutputStream("Text1.txt",true);
			fout.write(str.getBytes());
			fout.write("\r\n".getBytes());
			
			//fout.write(b);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally{
			try {
				fout.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

}
