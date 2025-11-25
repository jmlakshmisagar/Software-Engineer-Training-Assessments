package Day_Four_Generics;

public class PairClass<K, V> {
	private K key;
	private V value;

	public PairClass() {
		super();
	}

	public PairClass(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}

	@Override
	public String toString() {
		return "PairClass [key=" + key + ", value=" + value + "]";
	}

}
