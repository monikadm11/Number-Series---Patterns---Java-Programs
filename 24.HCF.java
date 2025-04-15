// 24.	WAP to find HCF of two given numbers

import java.util.Scanner;

class HCF    

{
	public static void main(String[] args)
	
	{
		Scanner kb = new Scanner(System.in); 
		System.out.print("Enter a first number = "); 
		int a = kb.nextInt();
		System.out.print("Enter a first number = "); 
		int b = kb.nextInt();
		
		System.out.print("HCF of " +a+ " & " +b+ " = " +getHCF(a, b)); 
		
	}
	public static int getHCF(int a, int b)
	{ 
		int hcf = 0; 
		for(int i = 1; i <= a && i <= b; i++)
		{ 
			if((a % i == 0) && (b % i == 0))
			{ 
			hcf = i; 
			} 
		}
		return hcf; 
	} 
}
/*
Enter a first number = 24
Enter a first number = 12
HCF of 24 & 12 = 12
*/