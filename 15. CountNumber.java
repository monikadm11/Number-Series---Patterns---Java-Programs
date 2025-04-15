// 15.	WAP to Count Number of Digits in an Integer

import java.util.Scanner;

class CountNumber   

{
	public static void main(String[] args)
	
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number =  ");
		int num = sc.nextInt();
		int digit = 0;
		int count = 0;
		int temp = num;
		
		while(num > 0)
		{
			digit = num % 10;
			count ++;
			num = num / 10;
			
		}

			System.out.println("count of number in " + temp + " = " + count);
	}
}

/*
Enter a number =  1235
count of number in 1235 = 4
*/