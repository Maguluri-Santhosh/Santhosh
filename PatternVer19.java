// 19. Write a program to print the following output.

import java.util.Scanner;
class PatternVer19{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of rows");
		int rows=sc.nextInt();
		for(int i=1;i<=rows;i++){
			for(int j=1;j<=(2*i)-1;j++){
				System.out.print("*");
			}
		System.out.println();	
		}
	}
}