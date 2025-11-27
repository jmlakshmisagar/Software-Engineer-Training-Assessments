package streams.api;

import java.util.Scanner;

public class MyStack {
	private static Node top = null;

	public static boolean isEmpty() {
		return top == null;
	}

	public static Node createNode(Scanner scanner) {
		return new Node(scanner.nextInt());
	}

	public static void push(Scanner scanner) {
		Node node = createNode(scanner);
		if (top == null) {
			top = node;
		} else {
			node.setNext(top);
			top = node;
		}
		System.out.println(node.getData());
	}

	public static void pop() {
		if (isEmpty()) {
			System.out.println("Stack is underflow");
		} else {
			System.out.println("Popped: " + top.getData());
			top = top.getNext();
		}
	}

	public static void display() {
		if (isEmpty()) {
			System.err.println("Stack is empty!");
		} else {
			Node temp = top;
			System.out.println("\nCurrent Stack (Top → Bottom):");
			while (temp != null) {
				System.out.print(" -> " + temp.getData());
				temp = temp.getNext();
			}
			System.out.println(" -> NULL");
		}
	}

}
