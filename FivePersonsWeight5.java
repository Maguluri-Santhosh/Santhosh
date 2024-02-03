// 5. Write a program to accept the weight of 5 persons (one by one) and display the net weight and the average weight.

package assignment.categoryA;

import java.util.Scanner;

public class FivePersonsWeight {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of persons: ");
		int weight[]=new int[sc.nextInt()];
		int netWeight=0;
		for(int i=0;i<=weight.length-1;i++) {
			System.out.print("Enter "+(i+1)+" person weight: ");
			weight[i]=sc.nextInt();
			netWeight=netWeight+weight[i];
		}
		System.out.println("net weight is: "+netWeight);
		System.out.println("Average weight is: "+(netWeight)/weight.length);
		
	}
}
