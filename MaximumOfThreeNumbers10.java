// 10.Write a program to accept three numbers and find the biggest number.

package assignment.ifStatement;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumOfThreeNumbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int nums[]=new int[3];
		int maxNum=nums[0];
		for(int i=0;i<=nums.length-1;i++) {
			System.out.print("Enter "+(i+1)+" number: ");
			nums[i]=sc.nextInt();
			maxNum=Math.max(maxNum, nums[i]);
		}
		System.out.println("Highest number of "+(Arrays.toString(nums))+" is "+maxNum);
	}
}