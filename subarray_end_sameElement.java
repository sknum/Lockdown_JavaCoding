import java.io.*;
import java.util.Scanner;
public class subarray_end_sameElement 
{ 
	public static void cntArray(int A[], int n) 
	{  
		int result = n; 
		for (int i = 0; i < n; i++)
		 { 
			int current_value = A[i]; 
			for (int j = i + 1; j < n; j++)
			 { 
				if (A[j] == current_value)
				 { 
					result++; 
				} 
			} 
		} 
		System.out.println(result); 
	} 
	public static void main(String[] args) 
	{ 
		int n,i;
		int[] A = new int[10];
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the array size\n");
		n=s.nextInt();
		System.out.println("Enter the array Elements"); 
		for(i=0;i<n;i++)
		{
			A[i]=s.nextInt();
		}
		cntArray(A, n); 
	} 
}
