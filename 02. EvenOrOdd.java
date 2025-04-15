//2.	WAP to find a Number is Even or Odd

import java.util.Scanner;

class EvenOrOdd

 {
	public static void main(String[] args)
	{
	 Scanner kb = new Scanner(System.in);
	 System.out.print("Enter a number= ");
	 int num = kb.nextInt();
	 if(num % 2 == 0)
		{
			System.out.print(num + " is an EVEN number");
		}
	else
		{
		System.out.print(num + " is an ODD number");
		}
	}
 }
 
 
 /*
Enter a number= 478
478 is an EVEN number

Enter a number= 5
5 is an ODD number
*/