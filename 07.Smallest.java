//7.	WAP to Find Smallest of Three Numbers

import java.util.Scanner;

class Smallest

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
	 
		if(a <= b && a <= c)
		{
			System.out.print(a + " is the SMALLEST number");
		}
		
		else if(b <= a && b <= c)
		{
			System.out.print(b + " is the SMALLEST number");
		}
		else 
		{
			System.out.print(c+ " is the SMALLEST number");
		}
	}
}


/*
Enter a first number= 3
Enter a second number= 4
Enter a third number= 5
3 is the SMALLEST number
*/
 
	 