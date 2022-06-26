import java.util.*;
public class Example{
	public static void main(String args[])
	{
		int arr[]= {10,80,65,66,93,84};
		for (int i=0;i<arr.length;i++)
			System.out.print(arr[i]+"");
System.out.println();
		Arrays.sort(arr);
		
		for (int i=0;i<arr.length;i++)
		System.out.print(arr[i]+" ");
	System.out.println();

	 	System.out.print(Arrays.binarySearch(arr,65));

	Arrays.fill(arr,4,6,90);
	 System.out.println();
	for (int i=0;i<arr.length;i++)
	    System.out.print(arr[i]+" ");
	}
}