//20. Write a program to print the following output.

import java.util.Scanner;
class PatternVer20{
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of rows");
		int rows=sc.nextInt();
		for(int i=1;i<=rows;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j+" ");
			}
			for(int j=i-1;j>=1;j--){
				System.out.print(j+" ");
			}
			System.out.println(  );
		}
	}
}