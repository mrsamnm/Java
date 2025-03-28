package EmailApp;

import java.util.Scanner;

public class emailapp {
	
	public static void main(String[] args) {
		
        Scanner in = new Scanner(System.in); 
        
		System.out.println(" What is the FIRST name of the new employee: ");
        String firstName =  in.nextLine(); 
        
		System.out.println(" What is the LAST name of the new employee: ");
        String lastName =  in.nextLine();  
        
		System.out.println(" What is the new employee's personal email: ");
        String altEmail =  in.nextLine(); 

		email eml = new email(firstName, lastName);
		eml.setAlternateEmail(altEmail);
		System.out.println(eml.showInfo());
	}

}
