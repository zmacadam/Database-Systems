package zmacadam.project1.domain;

import java.io.Serializable;

/**
 * Class Publisher is called JavaBean, it corresponds to the table Publisher in
 * Database. Each attribute in JavaBean corresponds to each field or column in
 * the table. There should also be setter and getter methods.
 * 
 * @author zmacadam
 *
 */
public class Publisher implements Serializable {
	
	// Private Data Members

	private String name;

	private String phone;
	
	private String city;

	// Constructor containing values for all Data Members
	public Publisher(String name, String phone, String city) {
		this.name = name;
		this.phone = phone;
		this.city = city;
	}

	// Default Contstructor
	public Publisher() {

	}

	// Convert Publisher object to String
	@Override
	public String toString() {
		return "Publisher [name=" + name + ", phone=" + phone + ", city=" + city + "]";
	}

	// Getters and Setters for Private Data Members
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
