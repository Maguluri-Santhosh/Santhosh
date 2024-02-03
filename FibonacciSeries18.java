// 18. Write a program to print the Fibonacci series up to the number 34. (Example: 0,1,1,2,3,5,8,13,…Series starts with 0 and 1, the succeeding numbers of the series are arrived by adding the previous 2 numbers.)

import java.util.Scanner;

class FibonacciSeries18
{
	public static void main(String[] args)
	{
		int a=0,b=0,c=1; 
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Value Of n:");
		int n=sc.nextInt();
		System.out.println("Fibonacci Series:");
			int count=0;
			while(count<=n)
			{
				
			a=b;
			b=c;
			c=a+b;
			System.out.print(a+" ");
			count++;
			if(a<=n)
				System.out.print(", ");
			}
	}
}