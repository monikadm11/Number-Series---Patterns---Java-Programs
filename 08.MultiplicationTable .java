// 8.	WAP to generate Multiplication Table

import java.util.Scanner;

class MultiplicationTable 

 {
	public static void main(String[] args)
	{
	 Scanner kb = new Scanner(System.in);
	 System.out.print("Enter a number= ");
	 int num = kb.nextInt();
		for(int i = 1; i<=10;i++)
		{
			System.out.println(num +" * " + i + " = " + (num*i));
			
		}
	}
}

/*
Enter a first number= 5
5 * 1 = 5
5 * 2 = 10
5 * 3 = 15
5 * 4 = 20
5 * 5 = 25
5 * 6 = 30
5 * 7 = 35
5 * 8 = 40
5 * 9 = 45
5 * 10 = 50
*/