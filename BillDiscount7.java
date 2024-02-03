//7. Write a program to accept the bill amount and age of the customer; if the customer’s age is >50 years then give a discount of 5% on the bill.

package assignment.ifStatement;

import java.util.Scanner;
class DiscountCalculation{
	public void calculateDiscount(double billAmount, int age) {
		if(age>50) {
			System.out.println("Discount applicable");
			billAmount=billAmount-(billAmount*(0.05));
			System.out.println("Total Bill Amount to be paid after discount: "+billAmount);
		}
		else {
			System.out.println("Discount not applicable");
			System.out.println("Total Bill Amount to be paid: "+billAmount);
		}
	}
}
public class BillDiscount {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		DiscountCalculation dc=new DiscountCalculation();
		System.out.print("Enter bill amount: ");
		double billAmt=sc.nextDouble();
		System.out.print("Enter age of customer: ");
		int personAge=sc.nextInt();
		dc.calculateDiscount(billAmt, personAge);
	}
}
