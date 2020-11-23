import java.util.Scanner;

public class removespaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		System.out.println("enter the line");
		String a = s.nextLine();
		
		//	String str = "Hello how are you";
	      a = a.replaceAll(" ", "");
	      System.out.println(a);
	}

}
