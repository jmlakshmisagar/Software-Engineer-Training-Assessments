package Day_Four_Generics;

public class Order<T> {
	private T items;

	@Override
	public String toString() {
		return "Order [items=" + items + "]";
	}

	public T getItems() {
		return items;
	}

	public void setItems(T items) {
		this.items = items;
	}

	public Order(T items) {
		super();
		this.items = items;
	}

	public Order() {
		super();
	}

}
