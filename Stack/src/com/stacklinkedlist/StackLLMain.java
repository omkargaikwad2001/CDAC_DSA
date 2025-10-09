package com.stacklinkedlist;

import java.util.Scanner;

public class StackLLMain {

	public static void main(String[] args) {
		
		StackLL s = new StackLL();
		
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			
			System.out.println("Enter 1 to push data");
			System.out.println("Enter 2 to pop data");
			System.out.println("Enter 3 to display data");
			System.out.println("Enter 0 to exit");
			
			choice = sc.nextInt();
			
			switch(choice) {
			
			case 1:
				System.out.println("Enter data to push");
				int val = sc.nextInt();
				s.push(val);
				break;
				
			case 2:
				System.out.println("Pop data = "+s.pop());
				break;
				
			case 3:
				s.display();
				break;
				
			case 0:
	
				break;
			
			default:
				System.out.println("Invalid input...");
				break;
			}
			
		}while(choice!=0);
		
		
		sc.close();
		
		System.out.println("Prog end...");
		
	}

}
