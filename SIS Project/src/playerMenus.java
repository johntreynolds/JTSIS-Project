import java.util.Scanner;

public class playerMenus
	{
		static Scanner userIntInput = new Scanner(System.in);

		public static int Menus()
	       
		 {
			 int menuChoice = 0;
			 System.out.println("Welcome!");
			 System.out.println("What would you like to do?");
			 System.out.println("1. Add or delete a student");
			 System.out.println("2. Change student grades/schedule");
			 System.out.println("3. Sort students");
			 int choice = userIntInput.nextInt();
			 
			 if(choice == 1){
				 System.out.println("1. Add student");
				 System.out.println("2. Delete student");
				 choice = userIntInput.nextInt();
				 if (choice == 1) {
					 menuChoice = 1;
				 }else {menuChoice = 2;}
			 }
			 else if(choice == 2) {
				 
	        
	        	 System.out.println("1. Change student grades");
	        	 System.out.println("2. Change student schedule");
	        	 choice = userIntInput.nextInt();
				 if (choice == 1) {
					 menuChoice = 3;
				 }else {menuChoice = 4;} 		
					 
				 }
				 
			 else 
				 {
					 System.out.println("1. Sort by last name");
		        	 System.out.println("2. Sort by GPA");
		        	 System.out.println("3. Sort by period");
		        	 choice = userIntInput.nextInt();
					 if (choice == 1) {
						 menuChoice = 5;
					 }else if  (choice == 2) {
						 menuChoice = 6;
			         }else {menuChoice = 7;} 
				 }
	        	 
		 
	return menuChoice;}}
