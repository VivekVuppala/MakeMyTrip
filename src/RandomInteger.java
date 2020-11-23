import java.util.Random;

public class RandomInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Random dice = new Random();
int number;
for(int counter=1;counter<=10;counter++) {
	
	number=20+dice.nextInt(10);
	
	System.out.println(number +"");
	
}

	}

}
