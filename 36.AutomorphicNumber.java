// 36.	Automorphic number

import java.util.Scanner; 

class AutomorphicNumber
{ 
	public static void main(String[] args)
	{ 
		Scanner kb = new Scanner(System.in); 
		System.out.print("Enter a number = "); 
		int num = kb.nextInt(); 
   
		if(((num * num) % 10) == num)
		{ 
			System.out.print(num+ " is an Automorphic Number!"); 
		} 
		else
		{ 
			System.out.print(num+ " is not an Automorphic Number!"); 
		} 
	} 
} 
/*
Enter a number = 5
5 is an Automorphic Number!

Enter a number = 7
7 is not an Automorphic Number!
*/