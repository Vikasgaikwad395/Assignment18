import java.io.Serializable;

public class Product implements Serializable{
	
		
		int id;
		String name;
		double price;
				
		public Product(int id, String name, double price) {
		
				this.id = id;
				this.name = name;
				this.price = price;
			}

		@Override
		public String toString() {
			return id+" " + name +" "+price;
		}	
}