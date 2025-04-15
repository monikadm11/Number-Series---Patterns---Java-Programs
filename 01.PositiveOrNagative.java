//1.	WAP to find a Number is Positive or Negative

import java.util.Scanner;

class PositiveOrNagative

{
	public static void main(String[] args)
	{
	Scanner kb = new Scanner(System.in);
	System.out.print("Enter a number= ");
	int num = kb.nextInt();
		if(num > 0)
		{
			System.out.println(num + "is an POSITIVE number ");
		}
		else if(num < 0)
		{
			System.out.println(num + "is an NAGATIVE number ");
		}
		else
		{
			System.out.println("ZERO");
		}
	}
}