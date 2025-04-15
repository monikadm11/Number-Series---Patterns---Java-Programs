// 20.	WAP to Check Whether a Character is an English Alphabet (upper & lower case) or Not

import java.util.Scanner;

class EnglishAlphabet
{
	public static void main(String[] args)
	
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Character =  ");
		char ch = sc.next().charAt(0);
		characterChecker(ch);
		
	}
	public static void characterChecker(char ch)
	{
		if(ch >= 65 && ch<=90)
		{
			System.out.println(ch + " is an UPPER_CASE Alphabet");
		}
		else if(ch >= 97 && ch <= 122) 
		{
			System.out.println(ch + " is an LOWER_CASE Alphabet");
		}
		else
		{
			System.out.println(ch + " is NOT an  Alphabet");
		}
	}
}
/*
Enter a Character =  a
a is an LOWER_CASE Alphabet

Enter a Character =  B
B is an UPPER_CASE Alphabet

Enter a Character =  9
9 is NOT an  Alphabet
*/