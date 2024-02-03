// 16. Write a program to accept a number from the user; display the natural number series for the entered number (1,2,3,4,…,N) and calculate the sum of this series

package assignment.iterative1;

import java.util.Scanner;

public class NaturalNumSeries {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any value for displaying range of natural numbers: ");
		int naturalNumRange=sc.nextInt();
		int sum=0;
		for(int i=1;i<=naturalNumRange;i++) {
			if(i<naturalNumRange) {
        		System.out.print(i+" , ");
        		}
        	else if(i==naturalNumRange){
        		System.out.print(i+" ");
        	}
			sum=sum+i;
		}
		System.out.println();
		System.out.println("Sum of the natural numbers upto "+naturalNumRange+" is: "+sum);
	}
}
