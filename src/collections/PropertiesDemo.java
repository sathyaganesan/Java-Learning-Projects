package collections;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties p = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\sathya.ganesan\\eclipse-workspace\\Sample_Code_Java\\src\\sample_packeage\\test.properties");
		p.load(fis);
		System.out.println("Data in File " +p);
		
		String ss = p.getProperty("dosai");
		System.out.println("Get Property " + ss);
		
		p.setProperty("poori", "17");
		FileOutputStream fos = new FileOutputStream("C:\\Users\\sathya.ganesan\\eclipse-workspace\\Sample_Code_Java\\src\\sample_packeage\\test.properties");
		p.store(fos, "Updated Price");
	}
}
