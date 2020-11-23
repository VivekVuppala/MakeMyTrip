import java.util.ArrayList;
import java.util.HashSet;

public class Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> a = new ArrayList<String>();// Elements will be saved in sequential order
		a.add("Vivek");
		a.add("Vivek");
		a.add("is");
		System.out.println(a);
		a.remove(1);
		/*System.out.println(a);
		a.removeAll(a);*/
		System.out.println(a);
		System.out.println(a.contains("is"));
		
		HashSet<String> h = new HashSet<String>();
		h.add("Vivek");
		h.add("is");
		h.add("a");
		h.add("good");
		System.out.println(h);
		
	}

}
