// 29.	Pronic/Heteromecic Number

import java.util.Scanner;
class PronicOrHeteromecicNumber
{
	public static void main(String[] args)
	{
	Scanner kb = new Scanner(System.in);
	System.out.print("Enter the range= ");
	int range=kb.nextInt();
	getPronicOrHeteromeci(range);
	
	}
	
	public static void getPronicOrHeteromeci(int range)
	{
	int first=0,next=0;
	if(range==1)
	{
		System.out.print(first+" ");
	}
	else if(range>=2)
	{
		System.out.print(+first);
		for(int i=2;i<=range;i++)
		{
		next= i*(i-1);
		System.out.print(" " +next);
	
		}
	}
	
}
}
/* 
Enter the range= 10
0 2 6 12 20 30 42 56 72 90
*/