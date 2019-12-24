package zmacadam.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

//@Entity will create a new table called Author
@Entity
public class Author {
	//Private Data Members, Attributes of the able Author
	@Id
	private String SSN; //Primary Key
	private String first_name;
	private String last_name;
	private Double income;
	private String address;
	@ManyToMany
	@JoinTable(
			name="Writes",
			joinColumns=@JoinColumn(name="aSSN"),
			inverseJoinColumns=@JoinColumn(name="bISBN")
			) //Creats a table Writes with attributes Author SSN, book ISBN
	private List<Book> books = new ArrayList<>();
	
	//Default Constructor
	public Author() {
		super();
	}
	
	//Constructor with Attribute values passed in
	public Author(String SSN, String first_name, String last_name, Double income, String address) {
		super();
		this.SSN = SSN;
		this.first_name = first_name;
		this.last_name = last_name;
		this.income = income;
		this.address = address;
	}
	
	//Getters and Setters for Private Data Members
	public String getSSN() {
		return SSN;
	}
	public void setSSN(String sSN) {
		SSN = sSN;
	}

	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public Double getIncome() {
		return income;
	}
	public void setIncome(Double income) {
		this.income = income;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
}
