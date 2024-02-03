// 3. Write a program to find the simple interest based on the following data: P = Rs 6000, R = 10%, T = 1.5 years.

package assignment.categoryA;

import java.util.Scanner;

public class SimpleInterest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter principal amount");
		int p=sc.nextInt();
		System.out.println("Enter rate of inetrest");
		double r=sc.nextDouble();
		System.out.println("Enter the time period in years");
		double t=sc.nextDouble();
		double SI=(p*t*r)/100;
		System.out.println(SI);
		
	}
}
