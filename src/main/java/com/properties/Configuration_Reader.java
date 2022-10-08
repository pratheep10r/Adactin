package com.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configuration_Reader {
	public static Properties p;
	
	public Configuration_Reader() throws IOException {
	File f = new File("C:\\Users\\Lenovo\\eclipse-workspace\\Maven_Project\\src\\main\\java\\com\\properties\\Project.properties");
			
	FileInputStream fis = new FileInputStream(f);
		 p = new Properties();
		 p.load(fis);
	}
 public String geturl() throws IOException {
	 
	 String url = p.getProperty("url");
	 return url;
 }
 
 public String getusername()  {
	
	 
	 String name = p.getProperty("username");
	 return name;
	 
}
 public String getpassword() {
	 
	 String pass = p.getProperty("password");
	 return pass;
	
}
 
 public String checkin() {
	 String in = p.getProperty("checkin");
	return in;
}

 public String checkout() {
	 String out = p.getProperty("checkout");
	 return out;
	
}
 
 public String firstname() {
	 String first = p.getProperty("firstname");
	return first;
}
 
 public String lastname() {
	String last = p.getProperty("lastname");
	return last;
}
 public String address() {
	String add = p.getProperty("address");
	return add;
}
 public String creditcard() {
     String cr = p.getProperty("credit");
	 return cr;
}
 
 public String cvvv() {
	String cv = p.getProperty("cvv");
	return cv;
}
 
 
 
 
 
 
 
 
 


}