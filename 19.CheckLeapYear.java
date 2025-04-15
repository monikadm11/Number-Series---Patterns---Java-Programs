// 19.	WAP to Check Leap Year

import java.util.Scanner;
class CheckLeapYear
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter a Year = ");
		int num = kb.nextInt();
		
		if(num % 100 == 0)
		{
			if(num % 400 == 0)
			{
				System.out.print("Leap Year");
			}
			else
			{
				System.out.print("Not Leap Year");
			}
		}
		else if(num % 4 == 0)
		{
			System.out.print("Leap Year");	
		}
		else
		{
			System.out.print("Not Leap Year");
		}
	}
}
/*
Enter a Year = 2024
Leap Year

Enter a Year = 2001
Not Leap Year
*/