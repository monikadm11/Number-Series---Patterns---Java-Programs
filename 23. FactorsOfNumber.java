// 23.	WAP to find Factors of given number

import java.util.Scanner;

class FactorsOfNumber    

{
	public static void main(String[] args)
	
	{
		Scanner kb = new Scanner(System.in); 
		System.out.print("Enter a number = "); 
		int num = kb.nextInt();
		System.out.print("The factors of " +num+ " are : "); 
		getFactor(num);
	}		
	public static void getFactor(int num)
	{ 
		for(int i = 1; i <= num; i++)
		{ 
			if(num % i == 0)
			{ 
				System.out.print(i+ " "); 
			} 
		} 
	} 
}
/*
Enter a number = 2
The factors of 2 are : 1 2

Enter a number = 15
The factors of 15 are : 1 3 5 15
*/

