
public class Constructor {
	
	public Constructor(){
		
	System.out.println("I am in constructor");	
	}
	
	public Constructor(int a){
		
		System.out.println("I am in parameterised constructor");	
		}
public void method(){
	System.out.println("I am in method");
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("I am in Main");
		
		Constructor c = new Constructor(5);
		c.method();
	}

}
