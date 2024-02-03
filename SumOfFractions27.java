package assignment.iterative1;

import java.util.Scanner;

public class SumOfFractions {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the value of n: ");
	        int n = sc.nextInt();

	        double seriesSum = 0.0;
	        for (int i = 1; i <= n; i++) {
	        	if(i<n) {
	        		System.out.print(1+"/"+i+" + ");
	        		}
	        	else if(i==n){
	        		System.out.print(1+"/"+i+" ");
	        	}
	        	seriesSum += 1.0/ i;
	        }
	        System.out.println("= " + seriesSum);
	}
}
