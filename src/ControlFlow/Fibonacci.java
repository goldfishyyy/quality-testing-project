
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int recursiveFibonacci(int n)
	{
		if(n <= 1)//if n == 0 or n == 1 then return n
		{
			return n;
		}
		return recursiveFibonacci(n-1) + recursiveFibonacci(n-1);
	}
}
