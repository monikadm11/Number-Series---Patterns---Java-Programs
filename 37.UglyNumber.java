//37.	Ugly Number

import java.util.Scanner; 

class UglyNumber
{ 
	public static void main(String[] args)
	{ 
		Scanner kb = new Scanner(System.in); 
		System.out.print("Enter a number = "); 
		int num = kb.nextInt(); 
   
		if(isUglynumber(num))
		{ 
			System.out.print(num+ " is an ugly number!"); 
		} 
		else
		{ 
			System.out.print(num+ " is not an ugly number!"); 
		} 
	} 
  
	public static boolean isUglynumber(int num)
	{ 
		if(num > 0)
		{ 
			while(num != 1)
			{ 
				if(num % 2 == 0)
				{ 
					num = num / 2; 
				} 
				else if(num % 3 == 0)
				{ 
					num = num / 3; 
				} 
				else if(num % 5 == 0)
				{ 
					num = num / 5; 
				} 
				else
				{ 
				return false; 
				} 
     
			} 
			return true; 
		} 
		return true; 
	} 
} 
/*
Enter a number = 6
6 is an ugly number!

Enter a number = 15
15 is an ugly number!

Enter a number = 14
14 is not an ugly number!
*/