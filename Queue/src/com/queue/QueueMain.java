package com.queue;

import java.util.Scanner;

public class QueueMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		MyQueue q = new MyQueue();
		
		int choice;
		
		do {
			
			System.out.println("------------------Menu------------------");
			System.out.println("Enter 1 to Initialize");
			System.out.println("Enter 2 to EnQueue");
			System.out.println("Enter 3 to DeQueue");
			System.out.println("Enter 4 to Display");
			System.out.println("Enter 0 to Exit");
			choice = sc.nextInt();
			
			switch(choice) {
				
			case 1:
				System.out.println("Enter size of queue");
				int size = sc.nextInt();
				q.initialize(size);
				System.out.println("Queue initialized...");
				break;
				
			case 2:		
				System.out.println("Enter value");
				int val = sc.nextInt();
				q.enQueue(val);
		
				break;
				
			case 3:
				
				System.out.println("Dequed : "+q.deQueue());
	
				break;
	
			case 4:
				
				q.display();
	
				break;
				
			case 0:
//				System.exit(0);
				break;
	
			default:
				System.out.println("Invalid Input");
				break;
			}
			
		}while(choice!=0);
		
		System.out.println("Prog ended...");
		
		sc.close();

	}

}
