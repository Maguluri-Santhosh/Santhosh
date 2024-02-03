// 33. Write a program to accept a number from the user and find the count of the digits that are prime numbers.

import java.util.Scanner;

public class PrimeNumbers33
{
    public static boolean isPrime(int num)
	{
        if (num <= 1)
		{
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++)
		{
            if (num % i == 0)
			{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args)
	{
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int count = 0;
        int temp = number;

        while (temp != 0)
		{
            int digit = temp % 10;
            if (isPrime(digit))
			{
                count++;
            }
            temp /= 10;
        }

        System.out.println("The count of prime digits in the number is: " + count);

    }
}