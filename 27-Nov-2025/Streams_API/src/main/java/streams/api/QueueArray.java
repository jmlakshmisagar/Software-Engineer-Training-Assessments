package streams.api;

import java.util.Scanner;

public class QueueArray {
	private static int front = -1;
	private static int rear = -1;
	private static final int SIZE = 10;
	private static int[] queue = new int[SIZE];

	public static boolean isEmpty() {
		return front == -1;
	}

	public static boolean isFull() {
		return rear == SIZE - 1;
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
		queue[++rear] = value;
		System.out.println("Enqueued: " + value);
	}

	public static void pop() {
		if (isEmpty()) {
			System.out.println("Queue Underflow!");
			return;
		}
		System.out.println("Dequeued: " + queue[front]);
		if (front == rear) {
			front = rear = -1; // Reset queue
		} else {
			front++;
		}
	}

	public static void display() {
		if (isEmpty()) {
			System.out.println("Queue is empty!");
			return;
		}
		System.out.print("Queue elements: ");
		for (int i = front; i <= rear; i++) {
			System.out.print(queue[i] + " ");
		}
		System.out.println();
	}
}
