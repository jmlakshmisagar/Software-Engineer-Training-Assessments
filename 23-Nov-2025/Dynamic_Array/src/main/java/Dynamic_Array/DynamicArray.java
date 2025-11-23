package Dynamic_Array;

public class DynamicArray {

	private int[] arr; // internal array
	private int size; // number of elements

	// constructor
	public DynamicArray() {
		arr = new int[5]; // initial capacity
		size = 0;
	}

	// Add element (resize manually)
	public void add(int element) {
		if (size == arr.length) {
			resize();
		}
		arr[size] = element;
		size++;
	}

	// Manual resize (double the size)
	private void resize() {
		int newCapacity = arr.length * 2;
		int[] newArray = new int[newCapacity];

		// manual copying
		for (int i = 0; i < arr.length; i++) {
			newArray[i] = arr[i];
		}

		arr = newArray;
	}

	// Get element
	public int get(int index) {
		if (index < 0 || index >= size)
			throw new IndexOutOfBoundsException("Invalid index: " + index);
		return arr[index];
	}

	// Remove element
	public void remove(int index) {
		if (index < 0 || index >= size)
			throw new IndexOutOfBoundsException("Invalid index: " + index);

		// shift elements manually
		for (int i = index; i < size - 1; i++) {
			arr[i] = arr[i + 1];
		}
		size--;
	}

	// Return current size
	public int size() {
		return size;
	}

	// String representation without Arrays.toString
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[ ");

		for (int i = 0; i < size; i++) {
			sb.append(arr[i]);
			if (i != size - 1)
				sb.append(", ");
		}

		sb.append(" ]");
		return sb.toString();
	}
}
