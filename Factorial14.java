// 14. Write a program to accept a number and find the factorial of the number.

import java.util.Scanner;

class Factorial14
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int number=sc.nextInt();
		int fact=1;
		for(int i=1;i<=number;i++){
		fact=fact*i;
	     
	}
		System.out.println(fact);
	}
}