//12.Write a program to accept any character from the user; determine whether it is – a letter in the upper case, lower case, digit, or a special symbol.  	(Hint: Use ASCII values.)

package assignment.ifStatement;

import java.util.Scanner;

public class CaseDetermination {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a character: ");
		char a=sc.next().charAt(0);
		if(((int)a)>=97 && ((int)a<=122)) {
			System.out.println("Character you entered is lower case letter");
		}
		else if(((int)a)>=65 && ((int)a<=90)) {
			System.out.println("Character you entered is upper case letter");
		}
		else if (((int)a >= 48 && (int)a <= 57)) {
		    System.out.println("Character you entered is a digit");
		}
		else if (((int)a >= 32 && (int)a <= 47) || 
		         ((int)a >= 58 && (int)a <= 64) || 
		         ((int)a >= 91 && (int)a <= 96) || 
		         ((int)a >= 123 && (int)a <= 126)) {
		    System.out.println("Character you entered is a special symbol");
		}
		else {
			System.out.println("Character you entered invalid character");
		}
	}
}
