/*A BufferedWriter is simply a Writer which uses a character buffer for 
increased efficiency when
 writing data.*/
 package day11;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterDemo_till_Bstream {
	
	  FileOutputStream fout =null;
	  BufferedOutputStream bout=null;
	
	  public void init() throws IOException
	{
		
		    fout = new FileOutputStream("out1.txt",true);  
	        bout=new BufferedOutputStream(fout);
		
	}
	  
	  
	public void writeFile() //throws IOException  
	{
		 
		 Scanner scan=new Scanner(System.in);
		   
		    String s=" ";
		    try {
		          
		     while (!s.equals("q") )
		    	 
		  { 
		     s=scan.nextLine();
		  if (!s.equals("q"))
		   {
		    
			  fout.write(s.getBytes());
			  fout.write("\r\n".getBytes());
				  
		}
		} 
		      
		    } catch(IOException e) {
		      System.out.println(e);
		    }	
			}
	
	
	void close() throws IOException
	{
		
		 bout.close();  	
	}
	
  public static void main(String[] args) throws IOException {
	  
	  FileWriterDemo_till_Bstream obj=new FileWriterDemo_till_Bstream();
	  obj.init();
	  obj.writeFile();
	  obj.close();
 
  }
}

