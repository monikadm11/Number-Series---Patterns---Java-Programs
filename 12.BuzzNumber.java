// 12.	WAP to find given number is fizz buzz number = % 3 & 5
// buzz number = %5


import java.util.Scanner;

class BuzzNumber  

{
	public static void main(String[] args)
	
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		
		if(num % 3 == 0 && num % 5 == 0)
		{
			System.out.println(num + " is a FizzBuzz Number");
		}
		else if(num % 3 == 0)
		{
			System.out.println(num + " is a Fizz Number");
		}
		else if(num % 5 == 0)
		{
			System.out.println(num + " is  a Buzz Number");
		}
		else 
		{
			System.out.println(num + " is not a fizzBuzz Number");
		}
	}
}

/*
Enter a number : 3
3 is a Fizz Number

Enter a number : 5
5 is  a Buzz Number

Enter a number : 15
15 is a FizzBuzz Number
*/