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
			System.out.println("Enter 3 to add by value");
			System.out.println("Enter 4 to delete from start");
			System.out.println("Enter 5 to delete from end");
			System.out.println("Enter 6 to delete by value");
			System.out.println("Enter 7 to update");
			System.out.println("Enter 8 to add at particular position");
			System.out.println("Enter 9 to delete in position");
			System.out.println("Enter 10 to Reverse");
			System.out.println("Enter 11 to GetMax");
			System.out.println("Enter 12 to Find occurence");
			System.out.println("Enter 13 to delete duplicate");
			System.out.println("Enter 99 to display");
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
				
				s.addByValue();
				
				break;
				
			case 4:
				
				s.deleteFromStart();
				
				break;
				
			case 5:
				
				s.deleteFromEnd();
				
				break;
				
			case 6:
				
				s.deleteByValue();
				
				break;
				
			case 7:
				
				s.update();
				
				break;
				
			case 8:
				
				s.addInPosi();
				
				break;
				
			case 9:
				
				s.deleteInPosi();
				
				break;
				
			case 10:
				
				s.reverse();
				
				break;
				
			case 11:
				
				System.out.println("Max = "+s.getMax());
			
				break;
				
			case 12:
				
				System.out.println("Enter value to find occurence in LL");
				int val = sc.nextInt();
				System.out.println("Occurence = "+s.findOccurence(val));
			
				break;
				
			case 13:
				
				s.deleteDuplicate();
			
				break;
				
			case 99:
				
				s.display();;
				
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
