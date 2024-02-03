// 26. Write a program to accept a number from the user and determine whether it is an Armstrong number or not (Example : 153 is Armstrong 1^3 + 5 ^3 +3 ^3 =153)

import java.util.Scanner;

class ArmstrongOrNot26
{
public static void main(String[] args)
{
	
	System.out.print("Enter An Integer:");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int dcs=0,dn=0;
	dn=n;
	while(n!=0)
	{	
	int rem=n%10;
	dcs = dcs+(rem*rem*rem);
	n=n/10;
	//n=q;
	}
	if(dn==dcs)
	System.out.println("Given Number Is An Armstrong");
	else
	System.out.println("Not An Armstrong");
	}
}