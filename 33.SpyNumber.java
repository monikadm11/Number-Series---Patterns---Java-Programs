// 33.	Spy Number

// import java.util.Scanner; 

// class SpyNumber
// { 
	// public static void main(String[] args)
	// { 
		// Scanner kb = new Scanner(System.in); 
		// System.out.print("Enter a num = "); 
		// int num = kb.nextInt(); 
		// int digit = 0;
		// int sum = 0;
		// int product = 1;
		// int temp = num;
		// while(num>0)
		// {
		// digit = num % 10;
		// sum = sum + digit;
		// product = product * digit;
		// num = num / 10;
		// }
		// num=temp;
		
		// if(sum==product)
		// {
			// System.out.print(num+ " is Spy Number!"); 
		// }
		// else
		// {
			// System.out.print(num+ " is not Spy Number!");
		// }
	// }
// }

/*
Enter a num = 1124
1124 is Spy Number!

Enter a num = 1111
1111 is not Spy Number!
*/
		
		
		
import java.util.Scanner;
 
class SpyNumber
{ 
	public static void main(String[] args)
	{ 
		Scanner kb = new Scanner(System.in); 
		System.out.print("Enter a num = "); 
		int num = kb.nextInt(); 
		if(getSumAndProduct(num))
		{ 
			System.out.print(num+ " is a Spy Number!"); 
		} 
		else
		{ 
			System.out.print(num+ " is not a Spy Number!"); 
		} 
	} 
	public static boolean getSumAndProduct(int num)
	{ 
		int digit = 0, sum = 0, product = 1; 
		while(num > 0)
		{ 
			digit = num % 10; 
			sum += digit; 
			product *= digit; 
			num /= 10; 
		} 
		return sum == product; 
	} 
}

/*
Enter a num = 1124
1124 is Spy Number!

Enter a num = 1111
1111 is not Spy Number!
*/