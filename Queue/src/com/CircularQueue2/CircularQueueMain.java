package com.CircularQueue2;

public class CircularQueueMain {

	public static void main(String[] args) {
		
		MyCircularQueue q = new MyCircularQueue(5);
		
		q.push(10);
		q.push(20);
		q.push(30);
		q.push(40);
		q.push(50);
//		q.push(60);
		q.pop();
		q.push(60);
//		q.push(70);
		q.pop();
//		q.pop();
		q.display();

	}

}
