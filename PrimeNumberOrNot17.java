// 17. Write a program to accept a number and determine whether it is a prime number or not.

import java.util.Scanner;

class PrimeNumberOrNot17
{
	public static void main(String[] args)
	{
	System.out.println("Enter An Integer To Test?");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int c=0;
	for(int d=1;d<n;d++)
		if(n%d==0)
			c++;
			if(c==1)
			System.out.println("Prime Number");
			else
			System.out.println("Not A Prime Number");
			}
}