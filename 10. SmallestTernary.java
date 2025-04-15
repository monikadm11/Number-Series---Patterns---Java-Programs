// 10.	WAP to Find the Smallest of Three Numbers. Using Ternary Operator

import java.util.Scanner;

class SmallestTernary

{
	public static void main(String[] args)
	
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a first number : ");
		int a = sc.nextInt();
		
		System.out.print("Enter a second number : ");
		int b = sc.nextInt();
		
		System.out.print("Enter a third number : ");
		int c = sc.nextInt();
		
		int smallest = (a<b) ? (a<c ? a : c) : (b<c ? b : c);
	
		{
			System.out.print("smallest number : "+smallest);
		}
	
	}
}
/*
Enter a first number : 34
Enter a second number : 45
Enter a third number : 67
smallest number : 34
*/