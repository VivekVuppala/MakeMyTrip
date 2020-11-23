
public class largest3numbers {

	
	//private static final int INT_MIN = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int arr[]= {100,200,300,400};
int first, second, third; 
third = first = second = 0;
for(int i=0;i<arr.length;i++) {
	
	if(arr[i]>first) {
		third = second;
        second = first;
        first = arr[i] ;}
	else if (arr[i]>second) {
		 second = first;
	        first = arr[i];	
	}
	else if(arr[i]>third) {first = arr[i];}
        
        
        
        
	
}

System.out.println(first+" "+second+" "+third);

	}

}
