//13.	How to Reverse a Number in Java?

import java.util.Scanner;

class ReverseNumber
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter a number = ");
		int num = kb.nextInt();
		int temp = num;
		int digit = 0;
		int sum = 0;
		
		
		while(num > 0)
		{
		digit = num % 10;
		sum = sum * 10 + digit;
		num = num / 10;
		System.out.println("revese number is : " + temp + " = " + sum  );
		}
	}
}

/*
Enter a number = 1234
revese number is : 1234 = 4
revese number is : 1234 = 43
revese number is : 1234 = 432
revese number is : 1234 = 4321
*/