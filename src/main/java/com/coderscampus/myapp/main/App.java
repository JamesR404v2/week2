package com.coderscampus.myapp.main;

import com.coderscampus.myapp.service.MyService;

public class App {
	
	private MyService myService = new MyService();
	
	public static void main(String[] args) {
		new App().execute();
	}

	private void execute() {
						
		// Your code goes here, not in the main() method
		// This removes any need to consume statics
		
		// requirements: https://proffesso.com/students/courses/274/sections/674/lessons/4798
		
				java.util.Scanner typedInput = new java.util.Scanner(System.in);

				System.out.println("Type a number between 50 and 300");

				String userInput = typedInput.nextLine();
				
				Integer numberizedInput = Integer.parseInt(userInput);

				if (numberizedInput > 50 && numberizedInput < 300) {  
				    	System.out.println("Yes");
				  
				}
				else
				{
					System.out.println("No");
				}
		

	}

}
