// 25. Write a program to accept a number from the user and find the reverse of the given number.

class ReverseNumber25
{  
	public static void main(String[] args)   
	{
	int rev=0;   
	for(int x=654321;x!= 0;x=x/10)   
	{
	int rem = x%10;  
	rev = rev * 10 + rem;  
	}
	System.out.println("The Reverse Of The Given Number Is: " + rev);  
	}
}