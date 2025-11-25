package Database_Connection_JDBC;

public class Pizza {

	public static class Builder {
		private String size;
		private boolean cheese;
		private boolean olives;

		public Builder(String size) {
			this.size = size;
		}

		public Builder cheese(boolean value) {
			this.cheese = value;
			return this;
		}

		public Builder olives(boolean value) {
			this.olives = value;
			return this;
		}

		public Pizza build() {
			return new Pizza(this);
		}
	}

	private String size;
	private boolean cheese;
	private boolean olives;

	private Pizza(Builder builder) {
		this.size = builder.size;
		this.cheese = builder.cheese;
		this.olives = builder.olives;
	}

	@Override
	public String toString() {
		return "Pizza [size=" + size + ", cheese=" + cheese + ", olives=" + olives + "]";
	}

}
