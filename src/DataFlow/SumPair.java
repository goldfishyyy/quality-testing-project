package DataFlow;

import java.util.*;

/**
 * Program that takes user inputs for n numbers(n>=2 in order to find integer
 * pairs) of non duplicate integers, Then find pairs of integers from the array
 * that make the sum equal to K and display the solution. It includes the
 * following main functions: 1)get a valid array length from user 2)get valid
 * numbers(integer, non-duplicate) from user 3)get valid target (integer) from
 * user 4)find integer pairs that sum up to the target
 * 
 * @author Yanyan Yang
 * @version 1.2 9/25/2019
 *
 */
public class SumPair {
	/*
	 * This function is used to ask user to enter the length of the array It will
	 * keep asking user to enter an valid integer(>=2) until get one.
	 * 
	 * @ param s: A scanner to catch the input
	 * 
	 * @ return integer
	 */
	public static int getArrayLength(Scanner s) {
		int arrayLength = 0;
		System.out.print("How long is the array?");
		System.out.println(" The mimimum length to check sum pair is 2");
		while (arrayLength <= 1) {
			System.out.println("Please enter a integer number greater than 1: ");
			try {
				arrayLength = s.nextInt();
			} catch (Exception e) {
				System.out.println("Error: Not an integer");
				s.nextLine();
			}
		}
		return arrayLength;
	}

	/*
	 * This function is used to get inputs for the array It requires user to enter
	 * distinct integer for desired length array It displays the given array when
	 * the it is valid(integer, no duplicate)
	 * 
	 * @params arraylength: the length of the array, scanner
	 * 
	 * @return ArrayList<Integer>
	 */
	public static ArrayList<Integer> getInputs(int arrayLength, Scanner s) {
		ArrayList<Integer> inputArray = new ArrayList<>();
		System.out.printf("Please enter %d numbers:\n", arrayLength);
		for (int i = 0; i < arrayLength; i++) {
			try {
				int number = s.nextInt();
				if (inputArray.contains(number)) {
					System.out.println("No duplicate input is allowed! Please try again: ");
					i--;
				} else {
					inputArray.add(number);
				}
			} catch (Exception e) {
				System.out.println("Error: Not an integer number. Please try agian: ");
				s.nextLine();
			}
		}
		System.out.println("The given array is: " + inputArray.toString());
		return inputArray;
	}

	/*
	 * This function is used to ask user for a target number It keeps asking for a
	 * valid input(integer number) until get it
	 * 
	 * @param s: A scanner to catch the input
	 * 
	 * @return integer
	 */
	public static int getTarget(Scanner s) {
		System.out.println("What number would you like to add up to?");
		int target = 0;
		while (true) {
			try {
				target = s.nextInt();
				break;
			} catch (Exception e) {
				System.out.println("Please enter an integer: ");
				s.nextLine();
			}
		}
		System.out.println("The target number is " + target);
		return target;
	}

	/*
	 * This function is used to find integer pairs that can add up to the given
	 * target It prints out all the solution pairs if there are any It prints error
	 * message when no solution is found
	 * 
	 * @params inputArray, target number
	 */
	public static void sumPair(ArrayList<Integer> inputArray, int target) {
		boolean pairFound = false;
		for (int i = 0; i < inputArray.size(); i++) {
			for (int j = i + 1; j < inputArray.size(); j++) {
				if (inputArray.get(j) == target - inputArray.get(i)) {
					System.out.println("[" + inputArray.get(i) + "," + inputArray.get(j) + "]");
					pairFound = true;
				}
			}
		}
		if (!pairFound) {
			System.out.println("No solution: can't find integer pairs for the given target");
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		// get valid array length from user
		int arrayLength = getArrayLength(s);

		// get valid array element from user
		ArrayList<Integer> inputArray = getInputs(arrayLength, s);

		// get the target number
		int target = getTarget(s);

		// find integer pairs for given array
		sumPair(inputArray, target);
		s.close();
	}

}
