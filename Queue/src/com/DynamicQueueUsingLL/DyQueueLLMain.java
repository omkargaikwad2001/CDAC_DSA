package com.DynamicQueueUsingLL;

import java.util.Scanner;

public class DyQueueLLMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DyQueueLL l = new DyQueueLL();
		
		int choice;
		
		do {
			System.out.println("Enter 1 to enQueue");
			System.out.println("Enter 2 to deQueue");
			System.out.println("Enter 3 to display");
			System.out.println("Enter 0 to exit");
			choice = sc.nextInt();
			
			switch (choice) {
			case 1: 
				System.out.println("Enter data to add");
				int val = sc.nextInt();
				l.enqueue(val);
				
				break;
			
			case 2: 
				System.out.println("DeQueued : "+l.deQueue());
				break;
				
			case 3: 
				l.display();
				break;
			
			case 0:
				break;
			default:
				System.out.println("Invalid choice...");
				break;
			}
			
		}while(choice!=0);
		
		System.out.println("Prog ended...");
	}

}
