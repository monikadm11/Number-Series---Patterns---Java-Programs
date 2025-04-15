//5.	WAP to Swap 2 numbers with 3 variables

import java.util.Scanner;

class Swap2Numbers

 {
	public static void main(String[] args)
	{
	Scanner kb = new Scanner(System.in);
	System.out.print("Enter a first number= ");
	int a = kb.nextInt();
	 
	System.out.print("Enter a second number= ");
	int b = kb.nextInt();
	 
	System.out.println("Before Swapping : ");
	System.out.println("a =" +a );
	System.out.println("b =" +b);
	
		int temp = a ;
		a = b;
		b = temp;
	System.out.println("After Swapping" );
	System.out.println("a =" +a );
	System.out.println("b =" +b);	
	
	}
}

/*
Before Swapping
a =10
b =20
After Swapping
a =20
b =10
*/