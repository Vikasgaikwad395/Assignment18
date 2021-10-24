
public class Test {

		 public void finalize() {
			 System.out.println("Finalize Method called................");
		 }
	public static void main(String[] args) {
		  Test  t = new Test();
		  Test t1  = new Test();
		   
		  t = t1;
		  
		  
		 System.gc();
		
	}

}
