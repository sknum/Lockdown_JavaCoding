import java.io.*;
import java.util.Scanner;
import java.lang.Math;
class Point
{
	public static void distance(double x1,double y1,double x2,double y2)
	{
		double d;
		d =Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		System.out.println("The distance is\n"+d);	
		
	}
	public static void main(String [] args)
	{
		double x1,x2,y1,y2;
		System.out.println("Enter the Values of Point 1: x1 and y1\n");
		Scanner s=new Scanner(System.in);
		x1=s.nextDouble();
		y1=s.nextDouble();
		System.out.println("Enter the Values of Point 1: x2 and y2\n");
		x2=s.nextDouble();
		y2=s.nextDouble();
		distance(x1,y1,x2,y2);
	}
} 		 
