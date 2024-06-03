package asr.spring.jdbc.entity;

public class Address {

	private String street;
	private String city;
	private Integer zipCode;
	private String state;
	private String country;
	
	public Address() {
		
	}

	public Address(String street, String city, Integer zipCode, String state, String country) {
		super();
		this.street = street;
		this.city = city;
		this.zipCode = zipCode;
		this.state = state;
		this.country = country;
	}

	public String getStreet() {
		return street;
	}

	public String getCity() {
		return city;
	}

	public Integer getZipCode() {
		return zipCode;
	}

	public String getState() {
		return state;
	}

	public String getCountry() {
		return country;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", zipCode=" + zipCode + ", state=" + state
				+ ", country=" + country + "]";
	}

		
	
	
}
