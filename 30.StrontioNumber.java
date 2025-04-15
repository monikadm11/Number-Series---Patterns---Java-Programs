// 30.	Strontio Number

import java.util.Scanner; 

class StrontioNumber
{ 
	public static void main(String[] args)
	{ 
		Scanner kb = new Scanner(System.in); 
		System.out.print("Enter a number = "); 
        int num = kb.nextInt(); 
	    if(num >= 1000 && num <= 9999)
		{ 
			if(isStrontio(num))
			{ 
				System.out.print(num+ " is a Strontio Number"); 
			} 
			else
			{ 
				System.out.print(num+ " is Not a Strontio Number"); 
			} 
		}
		
		else 
		{ 
            System.out.print("The number must be a four-digit number."); 
        } 
	} 
	public static boolean isStrontio(int num)
	{ 
		num = 2 * num; 
		boolean isStrontioNumber = false; 
		if(((num % 1000)/100) == ((num % 100)/10))
		{ 
			isStrontioNumber = true; 
		} 
		else 
		{
			isStrontioNumber = false; 
		}
		return isStrontioNumber; 
	} 
} 
/*
Enter a number = 1111
1111 is a Strontio Number

Enter a number = 1234
1234 is Not a Strontio Number
*/