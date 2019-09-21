
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		recursiveFibonacci(7);
		recursiveFibonacci(11);
		recursiveFibonacci(0);
	}
	
	/*
	 * This is the entry point to print the Fibonacci numbers.
	 * The function takes an integer n which determines the number of
	 * Fibonacci numbers to print out. if n is greater than zero then it prints the first
	 * number in the sequence and calls the fib() method passing it the first two numbers in the sequence
	 * and n-1. Finally this method will end the line with a \n character and return to the caller.
	 * */
	public static void recursiveFibonacci(int n)
	{
		if(n > 0)
		{
			System.out.print("0");
			fib(0, 1, n-1);
			System.out.print('\n');
		}
	}
	
	/*
	 * This method will check to see if n==0 and return without printing out any
	 * further Fibonacci numbers. If there are more numbers to print it will continue to
	 * call itself decrementing n each time.
	 * */
	public static void fib(int a, int b, int n)
	{
		if(n == 0)// if i is the nth fib number then we're done
		{
			return;
		}
		else
		{
			System.out.print(", "+b);	//print the ", " to make the output look organized and readable
			fib(b, a+b, n-1);			//a+b will be the next number in the sequence and the n-1 is what will eventually terminate the recursive calls
		}
	}
	
	
}
