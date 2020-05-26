import java.io.*;
import java.util.Scanner;
class tens
{
	public static void main(String[] args)
	{
		int n,i,temp;
		int a[]=new int[10];
		System.out.println("Enter the size of the array");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		System.out.println("Enter the array elements");
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("Array elements after removing the 10's");
		for(i=0;i<n;i++)
		{
			if(a[i]!=10)
			{
				System.out.println(+a[i]);
			}
		}
		for(i=0;i<n;i++)
		{
			if(a[i]==10)
			{
				temp=a[i]%10;
				System.out.println(+temp);
			}
		}
	}
}
