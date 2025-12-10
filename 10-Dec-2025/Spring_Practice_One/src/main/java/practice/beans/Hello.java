package practice.beans;

public class Hello {

	private String str;

	public Hello() {
		super();
	}

	public Hello(String str) {
		super();
		this.str = str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public String sayHello() {
		return "Hello " + str;
	}
}
