package test3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class properties {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Properties props=new Properties();
		props.setProperty("username", "ÆÑ±¦½£");
		props.setProperty("passwords","123456");
		//props.getProperty(key)
		props.store(new FileOutputStream("a.ini"), "comment line");
		
		Properties props2=new Properties();
		props2.setProperty("gender","male");
		props2.load(new FileInputStream("a.ini"));
		System.out.println(props2);
	}

}
