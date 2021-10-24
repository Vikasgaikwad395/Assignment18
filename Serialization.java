import java.io.*;
import java.io.ObjectOutputStream;

public class Serialization {
		 public static void main(String args[]) throws Exception{
			
			String file = "D:\\Vikas\\Product.txt";
			 
			 FileOutputStream fos = new FileOutputStream(file);
			 ObjectOutputStream oos = new ObjectOutputStream(fos);
			 
			 oos.writeObject(new Product(211, "ravi", 100));
			 oos.flush();
			 oos.close();
			 System.out.println("Serializable process.............");
			 	
		 }
}