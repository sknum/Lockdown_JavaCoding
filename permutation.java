import java.io.*;
import java.util.Scanner;
public class permutation 
{
   static int factorial(int n)
   {
      int fact;
      for(fact = 1; n > 1; n--)
	 {
         fact=fact*n;
      }
      return fact;
   }
   static int npr(int n,int r)
   {
      return factorial(n)/factorial(n-r);
   }
   public static void main(String args[])
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the value of n and r :");
      int n = sc.nextInt();
      int r = sc.nextInt();
      System.out.println("Permutation is\t"+npr(n,r));
   }
}
