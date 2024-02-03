// 15. Write a program to accept a number,calculate the sum of all even numbers from 0 till the given number; similarly repeat the same for the odd numbers; 	then display these two sums. (Example: input number 6; sum of even numbers = 0+2+4+6 =12, sum of odd numbers = 1+3+5 = 9).

package assignment.iterative1;

import java.util.Scanner;

public class SumOfEvenAndOdd {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any number for range: ");
		int num=sc.nextInt();
		int evenSum=0;
		int oddSum=0;
		if(num>0) {
			for(int i=0;i<=num;i++) {
				if(i%2==0) {
					evenSum=evenSum+i;
				}
				else {
					oddSum=oddSum+i;
				}
			}
			System.out.println("Even numbers sum is: "+evenSum);
			System.out.println("Odd numbers sum is: "+oddSum);
		}
		else {
			System.out.println("Entered number is negative");
		}
	}
}
