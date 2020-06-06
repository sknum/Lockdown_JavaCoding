import java.io.*;
import java.util.Scanner;
class Sort
{
	public static void main(String[] args)
	{
		int a[]=new int[20];
		int n,i,j,temp;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of array");
		n=s.nextInt();
		System.out.println("Enter the array elements");
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("The sorted array is");
		for(i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
	}
}
