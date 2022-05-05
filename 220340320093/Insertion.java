/*Function Description
Complete the insertionSort function in the editor below.
insertionSort has the following parameter(s):
n: an integer, the size of a1
a1: an array of integers to sort
Returns
Note: Print the interim and final arrays, each on a new line. No return value is expected.
Input Format
The first line contains the integer n , the size of the array a1 .
The next line contains n space-separated integers a1[0]…a1[n-1].
Constraints
1<=n<=1000
-1000<=a1[i]<=10000
Output Format
Print the array as a row of space-separated integers each time there is a shift or insertion*/
import java.util.*;
class Insertion{
	static int n;
	static int []a1;
	
	static void insertionSort(int []a1)
	
	{
		for(int i=0;i<n;i++)
		{	
			
			int key=a1[i];
			int j = i-1;
			
			while(j>=0 && a1[j]>key)
			{
				a1[j+1]=a1[j];
				j = j-1;
			}
			a1[j+1]=key;
		}		
	}
	int display(int []a1)
	{	
		System.out.println("Array after sorting");

		for(int i=0;i<n;i++)
		{
			System.out.print(a1[i]+" ");
		}
	}


	public static void main(String []args)
	{	
		Insertion Isc = new Insertion();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the size of the Array");
		        n = sc.nextInt();
		
		        a1 = new int[n];
		System.out.println("Enter array elements");
		for(int i=0;i<n;i++)
		{
			
		int value = sc.nextInt();
			System.out.println("Array elements: "+Isc.display(value));
		}
		insertionSort(a1);
		Isc.display(a1);
	}
}
