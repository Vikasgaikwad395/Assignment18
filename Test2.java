
class Store{
	class Material{
		public void list() {
		
		System.out.println("Sugar,Chocolate");	
	}
	}
	void check() {
		Material m = new Material();
		m.list();
	}
}

public class Test2 {

	public static void main(String[] args) {
		Store s = new Store();
		s.check();
		

	}

}
