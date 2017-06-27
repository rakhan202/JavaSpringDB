
public class Address {

	int house;
	String street;
	String city;
	String state;
	int zipCode;
	/**
	 * @param house
	 * @param street
	 * @param city
	 * @param state
	 * @param zipCode
	 */
	public Address(int house, String street, String city, String state,
			int zipCode) {
		this.house = house;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}
	@Override
	public String toString() {
		return "Address [house=" + house + ", street=" + street + ", city="
				+ city + ", state=" + state + ", zipCode=" + zipCode + "]";
	}
	
	
}
