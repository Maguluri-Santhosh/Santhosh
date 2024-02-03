// 24. Write a program to accept a number from the user and find the sum of digits in the given number.

import java.util.Scanner;

class SumOfDigits24
{
public static void main(String[] args)
{
	System.out.println("Enter An Integer(MultiDigited)");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int sor=0;
	do
	{
	int r=n%10;
	sor=sor+r;
	int q=n/10;
	n=q;
	}
	while(n!=0);
	System.out.println("Sum Of Digits = "+sor);
}
}