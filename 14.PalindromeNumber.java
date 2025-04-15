// 14.	Palindrome Number

import java.util.Scanner;

class PalindromeNumber   

{
	public static void main(String[] args)
	
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number =  ");
		int num = sc.nextInt();
		int digit = 0;
		int sum = 0;
		int temp = num;
		
		while(num > 0)
		{
			digit = num % 10;
			sum = sum * 10 + digit;
			num = num / 10;
		}
		num = temp;
		
		if(temp == sum )
		{
			System.out.print(temp + " is a PALINDROME number ");
		}
		else
		{
			System.out.print(temp + " is NOT a PALINDROME number ");
		}
	}
}

/*
Enter a number =  121
121 is a PALINDROME number
Enter a number =  123
123 is NOT a PALINDROME number
*/