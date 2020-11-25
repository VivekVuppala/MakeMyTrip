
public class Child extends Parent {
	
	public Child() {
		
		super();
	}
	
	
public void getData() {
		
	super.getData(5);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c = new Child();
	Parent p = new Child();  // Runtime Polymorphism 

		
	}

}
