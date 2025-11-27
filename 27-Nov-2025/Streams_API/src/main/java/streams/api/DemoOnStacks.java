package streams.api;

public class DemoOnStacks {

	private static int[] nums = new int[10];
	private static int top = -1;

	public static boolean isEmpty() {
		return top == -1;
	}

	public static boolean isFull() {
		return top == nums.length;
	}

	public static void push(int element) {
		if (isFull()) {
			System.err.println("Stack overflow");
		} else {
			nums[++top] = element;
		}
	}

	public static void pop() {
		if (isEmpty()) {
			System.err.println("Stack underflow");
		} else {
			System.out.println(nums[top--]);
		}
	}

	public static void display() {
		for (int i = 0; i < nums.length; i++)
			System.out.println(nums[i]);
	}

	public static void peek() {
		System.out.println(nums[top]);
	}

	public static void main(String[] args) {
		pop();
		
		push(9);
		push(9);
		push(9);
		push(9);
		push(9);
		push(9);
		push(9);
		
		display();
		peek();
	}
}
