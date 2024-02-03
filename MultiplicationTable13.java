// 13. Write a program to accept a number from the user and print its multiplication table (upto “times 10”).

package assignment.iterative1;

import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number for multiplication table: ");
		int a=sc.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(a+" X "+i+" = "+(a*i));
		}
	}
}
