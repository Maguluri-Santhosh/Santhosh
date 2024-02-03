/* 22. Write a program to print the following output.
		1
		2 3
		4 5 6 7
		8 9 10 11*/

class PatternVer22
{
	public static void main(String[] args)
	{
		int row=4;
		int s=1;
		for(int r=1;r<=row;r++)
		{
			for(int c=0;c<r;c++)
			{
					System.out.print(s+" ");
					s++;
			}
		System.out.println();	
		}
	}
}
