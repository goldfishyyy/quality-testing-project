package cuboid;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/**
 * Program that takes user inputs for the values of each side of a cuboid.
 * It inculdes the following main functions: 
 * 1)display longest and shortest edges
 * 2)calculate surface area of the square(if any) that made by two short edges 
 * 3)calculate the volume of the cuboid
 * @author Yanyan Yang
 * @version 1.1 9/17/2019
 *
 */
public class CuboidCalculation1 {
	/*
	 * This function is used to ensure user enter a decimal number
	 * It keeps asking user input until getting a valid decimal number
	 * @param s: A scanner to catch the input
	 * @return:  double 
	 */
	public static double decimalInput(Scanner s) {
		double input;
		while(true) {
			try {
				input=Double.parseDouble(s.next());
				return input;
				}
			catch(NumberFormatException err) {
				System.out.println("The input is not a decimal number!");
				System.out.println("Please enter again: ");
			}
		}
		
	}
	
	/*
	 * This function is used to validate if a number is positive
	 * It returns true for a number<=0
	 * It return false for a number>0
	 * @return: boolean
	 */
	public static boolean notPositive(double num) {
		if(num<=0)
			return true;
		else
			return false;
	}
	
	/*
	 * This function is used to validate if a number is integer
	 * It returns true for a number that has 0 fraction
	 * @return: boolean 
	 */
	public static boolean isInteger(double num) {
		if(Math.floor(num)==num)
			return true;
		return false;
	}
	/*
	 * This function is used to ask input
	 */
	public static void inputPrompt(String s) {
		System.out.printf("How long is the %s for the cuboid in centimeter?\n", s);
	}
	
	/*
	 * This function is used to display error message
	 */
	public static void displayError(String s) {
		System.out.println("The input is not a positive decimal number");
		System.out.printf("Please enter a number for %s again: \n",s);
	}
	
	/*
	 * This function is used to sort user input in ascending order
	 * @return: a sorted ArrayList
	 */
	public static ArrayList<Double> sortInput(Double length, Double breadth,Double height) {
		ArrayList<Double> list=new ArrayList<>();
		list.add(length);
		list.add(breadth);
		list.add(height);
		Collections.sort(list);
		return list;
	}
	/*
	 * This function is used to calculate the surface area of the square made by two shorter edges
	 * It displays the square surface area result if there is one 
	 * It displays error message if no square surface area for the given cuboid
	 */
	public static void squareSurfaceArea(double num1, double num2) {
		if(num1==num2) {
			double squareSurface=num1*num2;
			System.out.println("The surface area of the square made by two"
					+ " shorter edges are: "+squareSurface);
		}
		else {
			System.out.println("There is no square surface area "
					+ "made by the given cuboid");
		}
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		//Acquire a valid length: non-zero, non-negative, non-integer
		inputPrompt("LENGTH");
		double length=decimalInput(s);
		while((notPositive(length)||(isInteger(length)))){
			displayError("LENGTH");
			System.out.println("ask user agian ");
			length=decimalInput(s);
		}
		
		//Acquire a valid breadth:non-zero, non-negative, non-integer
		inputPrompt("BREADTH");
		double breadth=decimalInput(s);
		while((notPositive(breadth)||(isInteger(breadth)))){
			displayError("BREADTH");
			breadth=decimalInput(s);
		}
		
		//Acquire a valid height:non-zero, non-negative, non-integer
		inputPrompt("HEIGHT");
		double height=decimalInput(s);
		while((notPositive(height)||(isInteger(height)))){
			displayError("HEIGHT");
			height=decimalInput(s);
		}
		
		//sort input in ascending order
		ArrayList<Double> sortedInput=sortInput(length,breadth,height);
		
		//display shortest edge and longest edge
		double shortestEdge=sortedInput.get(0);
		double shorterEdge=sortedInput.get(1);
		double longestEdge=sortedInput.get(2);
		System.out.println("The shortest edge is "+shortestEdge);
		System.out.println("The longest edge is "+longestEdge);
		
		//calculate surface area of the square made by two shorter edge
		squareSurfaceArea(shortestEdge,shorterEdge);
		
		//calculate the volume of the cuboid
		double volumn=length*breadth*height;
		System.out.println("The volumn of the cuboid is "+volumn);
		}
}
	
