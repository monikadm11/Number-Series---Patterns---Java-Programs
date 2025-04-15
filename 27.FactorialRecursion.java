//27.	WAP to Find Factorial of a Number (Using Recursion)

import java.util.Scanner;

class FactorialRecursion    

{
	public static void main(String[] args)
	
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number =  ");
		long num = sc.nextInt();
		System.out.println(factorial(num)); 
	} 
	public static long factorial(long num)
	{ 
		if(num==1)
		{
			return 1;
		}
		else
		{
		 return num*factorial(num-1);
		}		
	} 
}
/*
Enter a number =  4
24

Enter a number =  8
40320
*/
