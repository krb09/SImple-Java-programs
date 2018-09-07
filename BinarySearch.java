package SearchinginJava;

public class BinarySearch {

	public static void main(String[] args) {
		int [] a= {1,2,3,4,5,6,7,8,9};
		int len = a.length;
		System.out.println(len);
		int key = 8;
		int s = 0;
		int l=len-1;
		int k= (s+l)/2;
		System.out.println("mid term is at index"+ k);
			if (key == a[k])
			{
				System.out.println("Found the key at: "+ (s+l)%2);
			}
			else if(key<a[k])
			{
			  System.out.println("The key is in lower half");
			}
			else 
			{
				System.out.println("They key is in upper half");
			}
				
		
		
	}

}
