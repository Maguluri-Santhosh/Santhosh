/* 20. Write a program to accept a number “n” from the user; then display the series 1,3,5,7,9,…,n and find the sum of the numbers in this series.*/

import java.util.Scanner;

class GivenSeries20
{
	public static void main(String[] args)
	{
	System.out.println("Enter An Integer:");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	for(int x=1;x<=n;x=x+2)
	System.out.println(x);
	}
}