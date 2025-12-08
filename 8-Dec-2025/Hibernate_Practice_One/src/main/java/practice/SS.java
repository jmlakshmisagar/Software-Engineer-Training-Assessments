package practice;

public class SS {

	private String s;
	private char ss;

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}

	public char getSs() {
		return ss;
	}

	public void setSs(char ss) {
		this.ss = ss;
	}

	@Override
	public String toString() {
		return "SS [s=" + s + ", ss=" + ss + "]";
	}

	public static void main(String[] args) {

		SS ss = new SS();
		System.out.println(ss);
	}
}


 