// 22.	How to find Prime Number in Java?

import java.util.Scanner; 

class PrimeNumber
{ 
	public static void main(String[] args)
	{ 
		Scanner kb = new Scanner(System.in); 
		System.out.print("Enter a number = "); 
		int num = kb.nextInt(); 
   
		if(isPrime(num))
		{ 
			System.out.print(num+ " is a Prime Number!"); 
		} 
		else
		{ 
			System.out.print(num+ " is not a Prime Number!"); 
		} 
	} 
	public static boolean isPrime(int num)
	{ 
		boolean isPrimeNumber = false; 
		for(int i = 2; i <= num/2; i++)
		{ 
			if(num % i != 0)
			{ 
				isPrimeNumber = true; 
			} 
			else
			{ 
				isPrimeNumber = false; 
				break; 
			}   
		} 
		return isPrimeNumber; 
	} 
}
/*
Enter a number = 23
23 is a Prime Number!
*/