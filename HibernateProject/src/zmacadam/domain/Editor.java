package zmacadam.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

//@Entity will create a Table called Editor
@Entity
public class Editor {
	//Private Data Members, Attributes of the table Editor
	@Id
	private String SSN; //Primary Key
	private String first_name;
	private String last_name;
	private Integer book_count;
	private Double salary;
	private String address;
	@ManyToMany
	@JoinTable(
			name="Edits",
			joinColumns=@JoinColumn(name="eSSN"),
			inverseJoinColumns=@JoinColumn(name="bISBN")
			) //Creates a table Edits with attributes Editor SSN, Book ISBN
	private List<Book> books = new ArrayList<>();
	@ManyToOne
	@JoinColumn(name="works_for")
	private Publisher publisher; //Foreign Key
	
	//Default Constructor
	public Editor() {
		super();
	}
	
	//Constructor with Attribute values passed in
	public Editor(String SSN, String first_name, String last_name, Double salary, String address, Integer book_count) {
		super();
		this.SSN = SSN;
		this.first_name = first_name;
		this.last_name = last_name;
		this.book_count = book_count;
		this.salary = salary;
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

	public Integer getBook_count() {
		return book_count;
	}
	public void setBook_count(Integer book_count) {
		this.book_count = book_count;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
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
	public Publisher getPublisher() {
		return publisher;
	}
	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}
}
