// 9.	WAP to Swap 2 numbers with only 2 variables


class SwapNumbers

 {
	public static void main(String[] args)
	{
	int a  = 90;
	int b  = 100;
	System.out.println("Before Swapping" );
	System.out.println("a =" +a );
	System.out.println("b =" +b);
	
		a = a + b;
		b = a - b;
		a = a - b;
	System.out.println("After Swapping" );
	System.out.println("a =" +a );
	System.out.println("b =" +b);	
	
	}
}

/*
Before Swapping
a =90
b =100
After Swapping
a =100
b =90
*/