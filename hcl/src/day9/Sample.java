package day9;

import java.io.*;
import java.util.*;

public class Sample {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Properties p=new Properties();
		p.load(new FileReader("config.properties"));
		
		System.out.println(p.getProperty("user"));
		System.out.println(p.getProperty("pass"));
	}

}
