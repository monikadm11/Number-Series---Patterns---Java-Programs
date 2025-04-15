//6.	WAP to Find Largest of Three Numbers

import java.util.Scanner;

class Largest

 {
	public static void main(String[] args)
	{
	 Scanner kb = new Scanner(System.in);
	 System.out.print("Enter a first number= ");
	 int a = kb.nextInt();
	 
	 System.out.print("Enter a second number= ");
	 int b = kb.nextInt();
	 
	 System.out.print("Enter a third number= ");
	 int c = kb.nextInt();
	 
		if(a >= b && a >= c)
		{
			System.out.print(a + " is the LARGEST number");
		}
		
		else if(b >= a && b >= c)
		{
			System.out.print(b + " is the LARGEST number");
		}
		else 
		{
			System.out.print(c+ " is the LARGEST number");
		}
	}
}


/*
Enter a first number= 89
Enter a second number= 34
Enter a third number= 800
800 is the LARGEST number 
*/