package Domain;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fchon
 */
public class Tickets {
    
	public static void main(String[] args) {
            
            int age = -1;
            int gender = -1;
            boolean run = true;
            
            //Geathering information about people
            Scanner input = new Scanner(System.in);  
            while(run){
                //reseting variables for next person 
                age = -1;
                gender = -1;
                System.out.println("Enter the info of the person: ");
                        
                while(age <= 0){
                    System.out.print("\tAge(int): ");
                    try{ 
                        age = input.nextInt();
                    }catch(Exception e){
                        age = -1;
                        input.nextLine();
                    } 
                    if(age <= 0){
                        System.out.println("\tNot a valid input");
                    }
                }	
                while(gender != 0 && gender != 1){
                    System.out.print("\tGender(0 for boy, 1 for girl): ");
                    try{ 
                        gender = input.nextInt();
                    }catch(Exception e){
                        gender = -1;
                        input.nextLine();
                    }  
                    if(gender != 0 && gender != 1){
                        System.out.println("\tNot a valid input");
                    }                
                }
                System.out.println(TicketMachine(age, gender));
            }
            input.close();   
	}    
        
        public static String TicketMachine(int age, int gender){
            //invalid input checks
            if(age < 0) { return "Age Input Error"; }
            if(gender != 0 && gender != 1) { return "Gender Input Error"; }
            
            if(age <= 5){
                return "Rhymes Competition";
            }else if(age > 5 && age <= 10){
                if(gender == 0){ return "Storytelling"; } 
                if(gender == 1){ return "Drawing Competition"; }
            }else if(age > 10 && age <= 15){
                if(gender == 0){ return "Quiz"; }
                if(gender == 1){ return "Essay writing"; }            
            }else if(age > 15 && age <= 18){
                //age is 15+ 
                return "Poetry competition";
            }else{
	    	return "No Ticket available!";
	    }
            
            return "Unexpected Error";
        }
}
