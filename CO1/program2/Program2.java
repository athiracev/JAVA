// Matrix addition 

import java.util.Scanner;
import java.io.*;
class Matrix
{
		int r1,c1,r2,c2,i,j;
		int m1[][] = new int[10][10];
		int m2[][] = new int[10][10];
		int s=0;
					
	void getData()
	{
		Scanner k =new Scanner(System.in);
		System.out.println("enter first matrix row and column value");
		r1 = k.nextInt();
		c1 = k.nextInt();
		System.out.println("enter second matrix row and column value");
		r2 = k.nextInt();
		c2 = k.nextInt();
		System.out.println("enter first matrix values");
		for(i=0;i<r1;i++)
		{
			for(j=0;j<c1;j++)
			{
				m1[i][j]=k.nextInt();
			}
		}
		System.out.println("enter second matrix values");
		for(i=0;i<r2;i++)
		{
			for(j=0;j<c2;j++)
			{
				m2[i][j]=k.nextInt();
			}
		}
		System.out.println("two Matrixes are");
		for(i=0;i<r1;i++)
		{
			for(j=0;j<c1;j++)
			{
				System.out.print(m1[i][j]+"\t");
			}
			System.out.println("");
		}
		System.out.println("");
		for(i=0;i<r2;i++)
		{
			for(j=0;j<c2;j++)
			{
				System.out.print(m2[i][j]+"\t");
			}
			System.out.println("");
		}
		System.out.println("");
		if(r1 == r2 && c1 == c2)
		{
			System.out.println("sum of matrix is");
			for(i=0;i<r1;i++)
			{
				for(j=0;j<c2;j++)
				{
					s = m1[i][j] + m2[i][j];
					System.out.print(s+"\t");
				}
				System.out.println("");
			}
		
		}
		else
		{
			System.out.println("addition cannot perform");
			
		}
	}

}
class Program2
{
	public static void main(String a[])
	{
		 Matrix m=new Matrix();
		 m.getData();
	}
	
}
