import java.io.*;

public class Deserializable {

	public static void main(String args[] ) throws Exception {
		
		String file = "D:\\Vikas\\Product.txt";
		
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Object obj = ois.readObject();
			Product p = (Product)obj;
			System.out.println(p);
						

	}

}
