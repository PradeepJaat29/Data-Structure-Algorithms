package Array;

import java.util.Scanner;

public class Question2D 
{
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		int number=sc.nextInt();
		
		int r=sc.nextInt();
		int c=sc.nextInt();
		
		int[][] arr=new int[r][c];
		
		//input
		//row
		for(int i=0;i<r;i++)
		{
			//column
			for(int j=0;j<c;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		
		
		//output
		for(int i=0;i<r;i++)
		{
			//column
			for(int j=0;j<c;j++)
			{
				if(arr[i][j]==number)
				{
					System.out.print(i+" "+j);
				}
			}
			
		System.out.println();
		}
		
	}

}
