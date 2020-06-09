import java.io.*; 
import java.util.Scanner;
class magicmatrix { 
      
    static int N = 3; 
    static boolean isMagicSquare(int mat[][]) 
    { 
         int sum = 0,sum2=0;  
        for (int i = 0; i < N; i++) 
            sum = sum + mat[i][i]; 
        for (int i = 0; i < N; i++) 
            sum2 = sum2 + mat[i][N-1-i]; 
        if(sum!=sum2)  
            return false; 
        for (int i = 0; i < N; i++) { 
            int rowSum = 0; 
            for (int j = 0; j < N; j++) 
                rowSum += mat[i][j]; 
            if (rowSum != sum) 
                return false; 
        } 
        for (int i = 0; i < N; i++) { 
  
            int colSum = 0; 
            for (int j = 0; j < N; j++) 
                colSum += mat[j][i];  
            if (sum != colSum) 
                return false; 
        } 
  
        return true; 
    } 
    public static void main(String[] args) 
    { 
        int mat[][]=new int[10][10];
	int n,i,j;
	System.out.println("Enter the size of matrix");
	Scanner s=new Scanner(System.in);
  	n=s.nextInt();
	System.out.println("Enter the elements");
	for(i=0;i<n;i++)
	{
		for(j=0;j<n;j++)
		{
			mat[i][j]=s.nextInt();
		}
	}
        if (isMagicSquare(mat)) 
            System.out.println("Magic Matrix"); 
        else
            System.out.println("Not a magic" + 
                                    " Matrix"); 
    } 
} 
