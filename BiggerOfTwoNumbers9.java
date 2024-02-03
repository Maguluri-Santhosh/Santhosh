// 9. Write a program to accept two numbers from the user and find the bigger of the two.

import java.util.Scanner;

class BiggerOfTwoNumbers9
{
	public static void main(String[] args)
	{
	Scanner sc= new Scanner(System.in);
	
	System.out.println("Enter A 1st Number:");
	
	int firstNumber = sc.nextInt();
	
	System.out.println("Enter A 2nd Number:");
	
	int secondNumber = sc.nextInt();
	
	System.out.println("Enter A Bigger Number:");
	
	int biggerNumber = Math.max(firstNumber, secondNumber);
	
	System.out.println("The Bigger Number Is:" +biggerNumber);
	}
}