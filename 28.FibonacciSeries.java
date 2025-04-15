// 28.	WAP to Display Fibonacci series up to a given number Fibonacci Series till 10 terms:
	//  0, 1, 1, 2, 3, 5, 8, 13, 21, 34 
	
class FibonacciSeries     

{
	public static void main(String[] args)
	
	{ 
		int n = 10;
		int firstTerm = 0;
		int secondTerm = 1;
		System.out.println("Fibonacci Series till " + n + " terms:");
		
		System.out.print(firstTerm + " " + secondTerm);
	
		for(int i=2;i<10;++i)
		{
		int nextTerm= firstTerm + secondTerm;
		firstTerm = secondTerm;
		secondTerm = nextTerm;
		System.out.print(" " +nextTerm);
	
		}
	}

}
/*
Fibonacci Series till 10 terms:
0 1 1 2 3 5 8 13 21 34
*/