// 4. Write a program to accept two numbers from the user and swap their values. (Example: x=12, y=15; after swapping x=15, y=12).

class Swap4
{
	public static void main(String[] args)
	{
		int x=12,y=15,z;
	System.out.println("x="+x+"y="+y);
	z=x;
	x=y;
	y=z;
	System.out.println("x="+x+"\n"+"y="+y);
	}
}