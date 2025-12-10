package practice.beans;

public class Address {
	private int addressid;
	private String city;

	public int getAddressid() {
		return addressid;
	}

	public void setAddressid(int addressid) {
		this.addressid = addressid;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [addressid=" + addressid + ", city=" + city + "]";
	}

	public Address(int addressid, String city) {
		super();
		this.addressid = addressid;
		this.city = city;
	}

	public Address() {
		super();
	}
}
