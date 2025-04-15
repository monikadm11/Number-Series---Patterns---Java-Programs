// 17.	Narcissistic number

import java.util.Scanner;

class NarcissisticNumber

{
	public static void main(String[] args)
	
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number =  ");
		int num = sc.nextInt();
		int digit = 0;
		int sum = 0;
		int count = 0;
		int temp = num;
		
		while(num > 0)
		{
			count ++;
			num = num / 10;
		}
		num = temp;
		
		while(num > 0)
		{
			digit = num % 10;
			sum = sum + getPower(digit,count);
			num = num / 10;
		}
		
		
		if(temp == sum)
			{
			System.out.println(temp + " is a Narcissistic number");
			}
			else
			{
				System.out.println(temp + " is NOT a Narcissistic number");
			}
		}
			
		public static int getPower(int digit,int count)
		{
		int power = 1;
		for(int i = 1; i<=count ; i++)
			{
				power = power * digit;
			}
				return power;
		}
}

/*
Enter a number =  153
153 is a Narcissistic number

Enter a number =  123
123 is NOT a Narcissistic number
*/