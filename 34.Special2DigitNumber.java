// 34.	Special 2-digit number

// import java.util.Scanner;
 
// class Special2DigitNumber
// { 
	// public static void main(String[] args)
	// { 
		// Scanner kb = new Scanner(System.in); 
		// System.out.print("Enter a num = "); 
		// int num = kb.nextInt();
		// int digit = 0;
		// int sum = 0;
		// int product = 0;
		// int temp = num;
		
		// while(num > 0)
		// {
			// digit = num % 10;
			// sum = sum + digit;
			// product = product * digit;
			// num = num / 10;
		// }
		
		// num = temp;
		
		// if(temp == sum + product)
		// {
			// System.out.print(num+ " is a Special 2-digit number!"); 
		// }
		// else
		// {
			// System.out.print(num+ " is not a Special 2-digit number!"); 
		// }
	// }
// }

/*
Enter a num = 59
59 is not a Special 2-digit number!

Enter a num = 12
12 is not a Special 2-digit number!

*/

import java.util.Scanner;
 
class Special2DigitNumber
{ 
	public static void main(String[] args)
	{ 
		Scanner kb = new Scanner(System.in); 
		System.out.print("Enter a number = "); 
		int num = kb.nextInt(); 
		int digit = 0, sum = 0, product = 1; 
		if(isSpecial2DigitNumber(num))
		{ 
			System.out.print("Special 2-digit number!"); 
		} 
		else	
		{ 
			System.out.print("Not a Special 2-digit number!"); 
		} 
	} 
	public static boolean isSpecial2DigitNumber(int num)
	{ 
		int digit = 0, sum = 0, product = 1, temp = num; 
		boolean isSpecial = false; 
		if(num >= 10 && num < 100)
		{ 
			while(num > 0)
			{ 
				digit = num % 10; 
				sum += digit; 
				product *= digit; 
				num /= 10; 
			} 
		} 
		if((sum + product) == temp)
		{ 
			isSpecial = true; 
		} 
		return isSpecial; 
	} 
}
/*
Enter a num = 59
59 is not a Special 2-digit number!

Enter a num = 12
12 is not a Special 2-digit number!

*/