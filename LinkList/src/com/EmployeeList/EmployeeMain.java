package com.EmployeeList;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		EmployeeList l = new EmployeeList();
		
		int choice;
		
		do {
			
			System.out.println("Enter 1 to add node");
			System.out.println("Enter 2 to display");
			System.out.println("Enter 0 to exit");
			
			choice = sc.nextInt();
			
			switch (choice) {
			case 1: 
				l.add();
				break;
				
			case 2: 
				l.display();
				break;
				
			case 0: 
				
				break;
			
			default:
				System.out.println("Invalid input");
			}
			
		}while(choice!=0);
		
		System.out.println("Prog ended....");

	}

}
