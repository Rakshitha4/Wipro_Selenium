package variables;

public class GCExample {

	protected void finalize() {
		System.out.println("Object is garbage collected");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 GCExample obj = new GCExample();
		 obj = null; // Eligible for GC
		 System.gc(); // Suggest GC
	}

}
