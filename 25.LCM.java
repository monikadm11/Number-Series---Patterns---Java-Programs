// 25.	WAP to find LCM of two given numbers

import java.util.Scanner;
 
class LCM
{ 
	public static void main(String[] args)
	{ 
		Scanner kb =  new Scanner(System.in); 
		System.out.print("Enter first number = "); 
		int a = kb.nextInt(); 
		System.out.print("Enter second number = "); 
		int b = kb.nextInt(); 
   
		HCF obj = new HCF(); 
		System.out.print("LCM of " +a+ " & " +b+ " = " +(a*b)/(obj.getHCF(a, b))); 
	} 
}
/*
Enter first number = 23
Enter second number = 3
LCM of 23 & 3 = 69
*/