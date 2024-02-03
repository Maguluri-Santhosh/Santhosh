// 8. Write a program to accept a number and find whether it is even or odd.

import java.util.Scanner;

class EvenOrOdd8
{
	public static void main(String[] args)
	{
		System.out.println("Enter An Integer:");
		Scanner scobj = new Scanner(System.in);
	int x=scobj.nextInt();
	x=x%2;
	if(x==0)
	System.out.println("Even");
	if(x==1)
	System.out.println("Odd");
	}
}