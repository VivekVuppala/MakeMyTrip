import java.util.Arrays;
public class HighestnumberinArray {

	
	public static void main(String[] args) {
		int arr[]= {1,5,10,150,20};
		
		
	//	int max=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[0]<arr[i])
				arr[0]=arr[i];
				}
		System.out.println(arr[0]);
		
	}
	
}
