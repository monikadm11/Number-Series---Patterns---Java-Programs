// 26.	WAP to Find Factorial of a Number

import java.util.Scanner;

class FactorialOfNumber    

{
	public static void main(String[] args)
	
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number =  ");
		int num = sc.nextInt();
		System.out.println(factorial(num)); 
	} 
	public static int factorial(int num)
	{ 
		int factorial = 1; 
		for(int i = 1; i <= num; i++)
		{  
			factorial *= i;
		}			
			return factorial; 
	} 
}
/*
Enter a number =  3
6

Enter a number =  5
120
*/

