package Domain;

import java.util.Scanner;

/**
 *
 * @author Csongor Farago (010129977)
 */
public class Tickets {
    
	public static void main(String[] args) {
            // Seting variables to default
            int age = -1;
            int gender = -1;
            boolean run = true;
            
            // Gathering information about people
            Scanner input = new Scanner(System.in);  
            while(run){
                // Repeat until process gets killed
                
                // Reseting variables for next person 
                age = -1;
                gender = -1;
                System.out.println("Enter the info of the person: ");
                        
                // Age input
                while(age <= 0){
                    // Trying to get an input until a valid age input is given
                    System.out.print("\tAge(int): ");
                    try{ 
                        age = input.nextInt();
                    }catch(Exception e){
                        // Input exception - Setting variable to invalid setting
                        age = -1;
                        input.nextLine();
                    } 
                    if(age <= 0){
                        // Exception or age is negative
                        System.out.println("\tNot a valid input");
                    }
                }
                
                //Gender input
                while(gender != 0 && gender != 1){
                    // Trying to get an input until a valid age input is given
                    System.out.print("\tGender(0 for boy, 1 for girl): ");
                    try{ 
                        gender = input.nextInt();
                    }catch(Exception e){
                        // Input exception - Setting variable to invalid setting
                        gender = -1;
                        input.nextLine();
                    }  
                    if(gender != 0 && gender != 1){
                        // Exception or gender is not 0 or 1
                        System.out.println("\tNot a valid input");
                    }                
                }
                
                // Printing out the ticket information
                System.out.println(TicketMachine(age, gender));
            }
            input.close();   
	}    
        
        public static String TicketMachine(int age, int gender){
            //invalid input checks
            if(age < 0) { return "Age Input Error"; }
            if(gender != 0 && gender != 1) { return "Gender Input Error"; }
            
            if(age <= 5){
                
                // Age is 5 or less
                return "Rhymes Competition";
                
            }else if(age > 5 && age <= 10){             
                // Age is between 5 and 10
                
                if(gender == 0){ 
                    // Boy
                    return "Storytelling"; 
                } else { 
                    // Girl
                    return "Drawing Competition"; 
                }
                
            }else if(age > 10 && age <= 15){               
                // Age is between 10 and 15
                
                if(gender == 0){ 
                    // Boy
                    return "Quiz"; 
                } else { 
                    // Girl
                    return "Essay writing"; 
                }            
                
            }else if(age > 15 && age <= 18){
                // Age is between 15 and 18
                
                return "Poetry competition";
                
            }else{
                // Age is more then 18
                
	    	return "No Ticket available!";
                
	    }
        }
}
