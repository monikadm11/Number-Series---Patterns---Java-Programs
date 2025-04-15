// 18.	Disarium number

import java.util.Scanner;

class DisariumNumber
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter a Number = ");
		int num = kb.nextInt();
		int sum = 0;
		int digit = 0;
		int temp = 0;
		temp = num;
		int count = 0;
		
		while(num > 0)
		{
			count++;
			num = num / 10;
		}
		num = temp;
		while(num > 0)
		{
			digit = num % 10;
			sum = sum + getPower(digit,count);
			num = num / 10;
			count--;
		}
		if(temp == sum)
		{
			System.out.print(sum + " is a Disarium Number");
		}
		else
		{
			System.out.print(sum + " is Not a Disarium Number");
		}
	}
	public static int getPower(int digit,int count)
	{
		int power = 1;
			for(int i = 1;i <= count;i++)
			{
				power = power * digit;
			}
			return power;
	}
}
/*
Enter a Number = 175
175 is a Disarium Number


Enter a Number = 89
89 is a Disarium Number

Enter a Number = 123
32 is Not a Disarium Number
*/