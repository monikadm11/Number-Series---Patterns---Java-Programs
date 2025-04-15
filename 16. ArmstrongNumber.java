// 16.	WAP to Check Armstrong Number

import java.util.Scanner;

class ArmstrongNumber   

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
			digit = digit * digit * digit ;
			sum = sum + digit;
			num = num / 10;
		}
		num = temp ;
			if(temp == sum)
			{
			System.out.println(temp + " is a Armstrong Number");
			}
			else
			{
				System.out.println(temp + " is NOT a Armstrong Number");
			}
	}
}

/*
Enter a number =  153
153 is a Armstrong Number

Enter a number =  123
123 is NOT a Armstrong Number
*/