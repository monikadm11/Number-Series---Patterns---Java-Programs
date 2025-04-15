// 32.	Harshad number

// import java.util.Scanner; 

// class HarshadNumber
// { 
	// public static void main(String[] args)
	// { 
		// Scanner kb = new Scanner(System.in); 
		// System.out.print("Enter a number = "); 
		// int num = kb.nextInt(); 
		// int digit = 0;
		// int sum = 0;
		// int temp = num;
		// while(num>0)
		// {
			// digit = num % 10;
			// sum = sum + digit;
			// num = num / 10;
		// }
		
		// if(temp % sum ==0)
		// {
			// System.out.print(+temp+ " is a Harshad Number");
		// }
		// else
		// {
			// System.out.print(+temp +" is not a Harshad Number");
		// }
	// }
// }

/*
Enter a number = 156
156 is an Harshad Number

Enter a number = 233
233 is not  Harshad Number
*/

import java.util.Scanner; 

class HarshadNumber
{ 
	public static void main(String[] args)
	{ 
		Scanner kb = new Scanner(System.in); 
		System.out.print("Enter a num = "); 
		int num = kb.nextInt(); 
		if(num % getSumOfDigits(num) == 0)
		{ 
			System.out.print(num+ " is Harshad number!"); 
		} 
		else
		{ 
			System.out.print(num+ " is not a Harshad number!"); 
		} 
	} 
	public static int getSumOfDigits(int num)
	{ 
		int digit = 0, sum = 0; 
		while(num > 0)
		{ 
			digit = num % 10; 
			sum = sum + digit; 
			num = num / 10; 
		} 
		return sum; 
	}
}
/*
Enter a number = 156
156 is an Harshad Number

Enter a number = 233
233 is not  Harshad Number
*/