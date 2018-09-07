
public class LinearSearch {

	public static void main(String[] args) {
		  int[] A= {1,2,3,4,5,6,8};
		  int key= 6;
		  int len = A.length;
		  for (int i=0;i<len;i++)
		  {if (A[i]==key)
		    System.out.println("Found the number at position: "+ i);
		    else
		    System.out.println("No such number at position: " + i);

	}

}
}
