
package streams.api;

import java.util.Scanner;

public class DemoOnCircularQueue {
	private static int front = -1;
	private static int rear = -1;
	private static int[] cq = new int[5];

	public static boolean isEmpty() {
		return front == -1;
	}

	public static boolean isFull() {
		return (rear + 1) % cq.length == front;
	}

	public static void push(Scanner scanner) {
		if (isFull()) {
			System.out.println("Queue Overflow!");
			return;
		}
		System.out.print("Enter value to enqueue: ");
		int value = scanner.nextInt();
		if (isEmpty()) {
			front = 0;
		}
		rear = (rear + 1) % cq.length;
		cq[rear] = value;
		System.out.println("Enqueued: " + value);
	}

	public static void pop() {
		if (isEmpty()) {
			System.out.println("Queue Underflow!");
			return;
		}
		System.out.println("Dequeued: " + cq[front]);
		if (front == rear) {
			front = rear = -1; 
		} else {
			front = (front + 1) % cq.length; 
		}
	}

	public static void display() {
		if (isEmpty()) {
			System.out.println("Queue is empty!");
			return;
		}
		System.out.print("Queue elements: ");
		int i = front;
		while (true) {
			System.out.print(cq[i] + " ");
			if (i == rear)
				break;
			i = (i + 1) % cq.length;
		}
		System.out.println();
	}
}
