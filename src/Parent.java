
public class Parent {

	int a =10;
	public Parent() {
		
		System.out.println("I am in parent class constructor");
	}
	public void getData() {
		int a= 2;
		System.out.println(a);
		System.out.println(this.a);
		
		System.out.println("Method without any arguements");
	}
	public void getData(int a) {
		
		System.out.println("Method with 1 arguement");
	} 
public void getData(int a,int b) {
		
		System.out.println("Method with 2 arguements");
	} 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Parent p= new Parent();
		p.getData();
		

	}

}
