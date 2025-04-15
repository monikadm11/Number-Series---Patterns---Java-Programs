// 31.	Krishnamurthy Number

import java.util.Scanner; 

class KrishnamurthyNumber
{ 
	public static void main(String[] args)
	{ 
	  Scanner kb = new Scanner(System.in); 
	  System.out.print("Enter a number = "); 
	  int num = kb.nextInt(); 
		if(num == getFactorialSum(num))
		{ 
			System.out.print(num+ " is Krishnamurthy Number!"); 
		} 
		else
		{ 
			System.out.print(num+ " is not a Krishnamurthy Number!"); 
		} 
	} 
	public static int getFactorialSum(int num)
	{ 
		int digit = 0, sum = 0; 
		while(num > 0)
		{ 
			digit = num % 10; 
			sum += getFactorial(digit); 
			num /= 10; 
		} 
		return sum; 
	} 
	public static int getFactorial(int digit)
	{ 
		if(digit == 1)
		{ 
			return 1; 
		} 
		return digit * getFactorial(digit - 1); 
	} 
}
/*
Enter a number = 145
145 is Krishnamurthy Number!

Enter a number = 123
123 is not a Krishnamurthy Number!
*/