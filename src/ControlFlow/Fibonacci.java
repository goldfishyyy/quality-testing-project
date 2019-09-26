package ControlFlow;
import java.util.Scanner;


public class Fibonacci {

	public static void main(String[] args) {
<<<<<<< Updated upstream
            
            int elements = -1;
            
            //Geathering information about people
            Scanner input = new Scanner(System.in);    
            for(int i = 1; i < 10; i++){                 
		while(elements == -1){
                    System.out.print("\tEnter the number of elements: ");
                    try{
                        elements = input.nextInt();
                    }catch(Exception e){
                        System.out.println("\tNot a valid input");
                        elements = -1;
                        input.nextLine();
                    }
                    
                    if(elements < 0){
                        System.out.println("\tNot a valid input");
                        elements = -1;
                        input.nextLine();                    
                    }
                }			             
            }
            input.close();   
            
            //Running the start of the recursive function
            recursiveFibonacci(elements);
=======
		// TODO Auto-generated method stub
		recursiveFibonacci(7);
		recursiveFibonacci(11);
		recursiveFibonacci(0);
>>>>>>> Stashed changes
	}
	
	/*
	 * This is the entry point to print the Fibonacci numbers.
	 * The function takes an integer n which determines the number of
	 * Fibonacci numbers to print out. if n is greater than zero then it prints the first
	 * number in the sequence and calls the fib() method passing it the first two numbers in the sequence
	 * and n-1. Finally this method will end the line with a \n character and return to the caller.
	 * */
<<<<<<< Updated upstream
	public static void recursiveFibonacci(int n){
            if(n > 0){
		System.out.print("0");
		fib(0, 1, n-1);
		System.out.print('\n');
            }
=======
	public static void recursiveFibonacci(int n)
	{
		if(n > 0)
		{
			System.out.print("0");
			fib(0, 1, n-1);
			System.out.print('\n');
		}
>>>>>>> Stashed changes
	}
	
	/*
	 * This method will check to see if n==0 and return without printing out any
	 * further Fibonacci numbers. If there are more numbers to print it will continue to
	 * call itself decrementing n each time.
	 * */
<<<<<<< Updated upstream
	public static void fib(int a, int b, int n){
            // if i is the nth fib number then we're done
            if(n == 0){
		return;
            } else {
                //print the ", " to make the output look organized and readable
		System.out.print(", "+b);	
                //a+b will be the next number in the sequence and the n-1 is what will eventually terminate the recursive calls
		fib(b, a+b, n-1);			
            }
=======
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
>>>>>>> Stashed changes
	}
	
	
}
