package ControlFlow;
import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayList;

public class BodyMassIndex {

	public static void main(String[] args) {
            ArrayList<Person> people = new ArrayList<Person>();
            
            //Geathering information about people
            Scanner input = new Scanner(System.in);             
            for(int i = 1; i < 10; i++){
                Person p = new Person(0, 0);                       
		System.out.println("Enter the data for person " + i);
		while(p.weight == 0){
                    System.out.print("\tEnter weight in kilograms: ");
                    try{
                        p.weight = input.nextDouble();
                    }catch(Exception e){
                        System.out.println("\tNot a valid input");
                        p.weight = 0;
                        input.nextLine();
                    }
                }			
		while(p.height == 0){
                    System.out.print("\tEnter height in meters: ");
                    try{
                        p.height = input.nextDouble();
                    }catch(Exception e){
                        System.out.println("\tNot a valid input");
			p.height = 0;
			input.nextLine();
                    }
                }              
                people.add(p);
            }
            input.close();
            
            //Calculate mean for all people
            double mean = CalculateMean(people);
            System.out.println("\n");
            System.out.println("BMI mean for all people:  " + mean);
            
            //Printing people info
            //printin people above the mean (skipping people who <= mean)
            System.out.println("People above the mean:");
            for(int i = 0; i < people.size(); i++){   
                if(people.get(i).bmi() <= mean) continue;
                System.out.print("\t");
                System.out.print("BMI for person "+i+": "+people.get(i).bmi());
                System.out.print(", Fall in range: "+people.get(i).range());
                System.out.println(", Above the mean!");
            }
            //printin people bellow the mean (skipping people who > mean)
            System.out.println("People bellow the mean:");
            for(int i = 0; i < people.size(); i++){   
                if(people.get(i).bmi() > mean) continue;
                System.out.print("\t");
                System.out.print("BMI for person "+i+": "+people.get(i).bmi());
                System.out.print(", Fall in range: "+people.get(i).range());
                System.out.println(", Bellow the mean!");
            }            	
	}
        
        // Method used to run trough the array of people and determine the mean BMI
	public static double CalculateMean(ArrayList<Person> people){
            double sum = 0;                     
            for(int i = 0; i < people.size(); i++){
                sum += people.get(i).bmi();
            }          
            return sum / people.size();
	}
	
	//This class is used to hold data on a person and calculate his/her BMI and BMIRange
        public static class Person {
            
            public double weight;
            public double height;                      
            
            //Constructor
            public Person(double weight, double height){
                this.weight = weight;
                this.height = height;               
            }
            
        
            // Method to Calculate BMI with given weigh/height numbers
            public double bmi(){
                return weight / Math.pow(height, 2);
            }
            
            // Method to Calculate BMI with new weigh/height numbers
            public double bmi(double weight, double height){
                this.weight = weight;
                this.height = height;                   
                return bmi();
            }
            
            
            // Method to determen what range is the person fall into
            public String range(){
                double bmi = this.bmi();
                if(bmi < 18.5) { return "Underweight"; }
                else if(bmi >= 18.5 && bmi < 25) { return "Normal"; } 
                else if(bmi >= 25 && bmi < 30) { return "Overweight"; } 
                else { return "Obese"; }            
            }            
        }

}
