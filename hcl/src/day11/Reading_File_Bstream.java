package day11;

import java.io.*;

public class Reading_File_Bstream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStream in=null;
		byte a[]=new byte[100];
		
		try {
			in=new FileInputStream("Text.txt");
			in.read(a);
			String str=new String(a);
			
			System.out.println(str.trim());
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			in.close();
		}
	}

}
