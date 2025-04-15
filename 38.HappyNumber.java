//38.	Happy number

import java.util.Scanner; 

class HappyNumber
{ 
	public static void main(String[] args)
	{ 
		Scanner kb = new Scanner(System.in); 
		System.out.print("Enter a Number = "); 
		int num = kb.nextInt(); 
		int temp = num; 
		while(num != 1 && num != 4)
		{ 
			num = isHappyNumber(num); 
		} 
		if(num == 1)
		{ 
			System.out.print(temp+ " is a Happy Number!"); 
		} 
		if(num == 4)
		{ 
			System.out.print(temp+ " is not a Happy Number!"); 
		} 
	}  
	public static int isHappyNumber(int num)
	{ 
		int digit = 0, sum = 0; 
		while(num > 0)
		{ 
			digit = num % 10; 
			sum += (digit * digit); 
			num /= 10; 
		} 
		return sum; 
	} 
}
/*
Enter a Number = 19
19 is a Happy Number!

Enter a Number = 49
49 is a Happy Number!

Enter a Number = 97
97 is a Happy Number!

Enter a Number = 4
4 is not a Happy Number!
*/