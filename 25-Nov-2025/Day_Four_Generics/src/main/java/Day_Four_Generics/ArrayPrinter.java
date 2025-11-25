package Day_Four_Generics;

import java.util.Arrays;

public class ArrayPrinter<T> {
	private T[] array;
	

	public T[] getArray() {
		return array;
	}

	public void setArray(T[] array) {
		this.array = array;
	}

	public ArrayPrinter(T[] array) {
		super();
		this.array = array;
	}

	@Override
	public String toString() {
		return "ArrayPrinter [array=" + Arrays.toString(array) + "]";
	}

}
