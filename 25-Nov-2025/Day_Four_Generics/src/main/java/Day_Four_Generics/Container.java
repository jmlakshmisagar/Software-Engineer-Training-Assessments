
package Day_Four_Generics;

public class Container<T> {
	private T item;

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}

	@Override
	public String toString() {
		return "Container [item=" + item + "]";
	}
}
