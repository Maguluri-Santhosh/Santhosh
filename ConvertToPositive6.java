// 6. Write a program to accept a number from the user. If the number is negative then convert it to a positive 	number and print; if it is a positive number,print it as is.

package assignment.ifStatement;

import java.util.Scanner;

class PositiveConversion{
	public void convertPositive(int a) {
		if(a<0) {
			System.out.println(a+" is negative number");
			a=-(a);
			System.out.println("Positive number is: "+a);
		}
		else {
			System.out.println("Given number is positive: "+a);
		}
	}
}
public class ConvertToPositive {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a value: ");
		PositiveConversion pc=new PositiveConversion();
		pc.convertPositive(sc.nextInt());
	}
}
