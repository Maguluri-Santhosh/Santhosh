// 21. Write a program to print the following output.

import java.util.Scanner;
class PatternVer21{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of rows");
		int rows=sc.nextInt();
		for(int i=1;i<=rows;i++){
			for(int j=1;j<=rows;j++){
				if(j==i){
					System.out.print(19+" ");
				}
				else
				{
					System.out.print(0+" ");
				}
			}
		System.out.println();	
		}
	}
}