
public class DuplicateLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s= "vivek is";
		char[] arr = s.toCharArray();
		
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<s.length();j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[j]);
					
					
				}
				
			}
		}
		
		
	}

}
