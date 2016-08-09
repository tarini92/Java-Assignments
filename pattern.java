package prepassignments;
import java.io.*;
import java.math.*;

public class pattern {

	public static void main(String[] args)
	{
	pattern ob = new pattern();
	ob.pattern1();
	}
	public void pattern1()
	{
		int i,j,k;
		for(i = 0; i<=9; i++)
		{
			for(j=i;j<=9;j++)
			{
				System.out.print(" ");
			}
			for(j=0;j<=i;j++)
				{
				System.out.print(j);
				}
			for(k=i-1;k>=0;k--)
			{
				System.out.print(k);
			}
			System.out.println();
		}
	}
	public void pattern2()
	{
	 int i,num = 1;
	 System.out.println("0");
	 System.out.println("0"+"1");
	 for(i=1;i<9;i++)
	 {
		 num += Math.pow(10, i);
		 System.out.println("0"+(long)Math.pow(num, 2)+"0");
	 }
	
	 }
	
	}
