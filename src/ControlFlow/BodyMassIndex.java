import java.util.Scanner;
import java.lang.Math;

public class BodyMassIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String output = "";
		double weight;
		double height;
		
		for(int i = 1; i < 10; i++)
		{
			System.out.println("Enter the data for person " + i);
			weight = 0;
			height = 0;
			while(weight == 0)
			{
				System.out.print("\tEnter weight in kilograms: ");
				try
				{weight = input.nextDouble();}
				catch(Exception e)
				{
					System.out.println("\tNot a valid input");
					weight = 0;
					input.nextLine();
				}
				//input.nextLine();
			}
			
			while(height == 0)
			{
				System.out.print("\tEnter height in meters: ");
				try
				{height = input.nextDouble();}
				catch(Exception e)
				{
					System.out.println("\tNot a valid input");
					height = 0;
					input.nextLine();
				}
				//input.nextLine();
			}
			
			weight *= 2.20462;
			height *= 39.3701;
			output = output.concat(("BMI for person " + i + ": " + BMI(weight, height)+ "\n"));
		}
		input.close();
		System.out.println(output);
		
	}
	public static double BMI(double weight, double height)
	{
		return ( weight * 703.0) / Math.pow(height, 2);
	}
}
