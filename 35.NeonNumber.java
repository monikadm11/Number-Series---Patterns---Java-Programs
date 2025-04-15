//35.	Neon Number

import java.util.Scanner; 

class NeonNumber
{ 
	public static void main(String[] args)
	{ 
		Scanner kb = new Scanner(System.in); 
		System.out.print("Enter a number = "); 
		int num = kb.nextInt(); 
		if(num == getSquare(num))
		{ 
			System.out.print(num+ " is a Neon Number"); 
		} 
		else
		{ 
			System.out.print(num+ " is not a Neon Number"); 
		} 
	} 
	public static int getSquare(int num)
	{ 
		int digit = 0, sum = 0; 
		num = num * num; 
		while(num > 0)
		{ 
			digit = num % 10; 
			sum += digit; 
			num /= 10; 
		} 
		return sum; 
	} 
}
/*
Enter a number = 9
9 is a Neon Number
Enter a number = 2
2 is not a Neon Number
*/