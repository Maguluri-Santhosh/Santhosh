package assignment.iterative1;

import java.util.Scanner;

public class SumOfFractionNumbers {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the value of n: ");
	        int n = sc.nextInt();

	        double fractionsSum = 0.0;
	        for (int i = 1; i <= n; i++) {
	        	if(i<n) {
	        		System.out.print(1+"/"+i+"3 + ");
	        		}
	        	else if(i==n){
	        		System.out.print(1+"/"+i+"3 ");
	        	}
	        	fractionsSum += 1.0/ ((i*10)+3);
	        }
	        System.out.println("= " + fractionsSum);
	}
}
