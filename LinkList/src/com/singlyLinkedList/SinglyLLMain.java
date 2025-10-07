package com.singlyLinkedList;

import java.util.Scanner;

public class SinglyLLMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			
		int choice;
		
		SinglyLL s = new SinglyLL();
		
		do {
			
			System.out.println("-------------------Menu-------------------");
			System.out.println("Enter 1 to add elmetnt at start");
			System.out.println("Enter 2 to add elmetnt at end");
			System.out.println("Enter 3 to display");
			System.out.println("Enter 0 to exit");
			
			choice = sc.nextInt();
			
			switch(choice) {
			
			case 1:
				
				s.addAtStart();
				
				break;
				
			case 2:
				
				s.addAtEnd();
				
				break;
				
			case 3:
				
				s.display();
				
				break;
				
			case 0:
				
				break;
				
			default:
				System.out.println("Invalid choice...");
				break;
			}
			
		}while(choice!=0);
		
		System.out.println("Prog end...");
		
		sc.close();
		
	}

}
