// 11.If cost price and selling price of an item is input through the keyboard, write a program to determine whether the seller has made a profit or incurred a    	loss. Also determine the quantum of profit or loss.

package assignment.ifStatement;

import java.util.Scanner;

public class ProfitOrLoss {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter cost price: ");
		double costPrice=sc.nextDouble();
		System.out.print("Enter selling price: ");
		double sellingPrice=sc.nextDouble();
		if(sellingPrice>costPrice) {
			System.out.println("Selling price is high so, seller is at profit");
			System.out.println("Quantum of profit is: "+(sellingPrice-costPrice));
		}
		else {
			System.out.println("Cost price is high so, seller is at loss");
			System.out.println("Quantum of loss is: "+(costPrice-sellingPrice));
		}
	}
}
