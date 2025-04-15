// 11.	WAP to find Largest of Three Numbers. Using Ternary Operator

import java.util.Scanner;

class LargestTernary  

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
		
		int largest=(a>b)?(a>c ? a : c) : (b>c? b : c);
		
		{
			System.out.print("largest number : "+largest);
		}
	}
}
/*
Enter a first number : 23
Enter a second number : 12
Enter a third number : 67
largest number : 67
*/