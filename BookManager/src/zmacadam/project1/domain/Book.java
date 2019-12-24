package zmacadam.project1.domain;

import java.io.Serializable;

/**
 * Class Book is called JavaBean, it corresponds to the table Book in
 * Database. Each attribute in JavaBean corresponds to each field or column in
 * the table. There should also be setter and getter methods.
 * 
 * @author zmacadam
 *
 */
public class Book implements Serializable {
	
	// Private Data Members
	private String ISBN;

	private String title;

	private Integer year;

	private String published_by;

	private String previous_edition;
	
	private Double price;

	// Constructor containing values for all Data Members
	public Book(String ISBN, String title, Integer year, String published_by, String previous_edition, Double price) {
		this.ISBN = ISBN;
		this.title = title;
		this.year = year;
		this.published_by = published_by;
		this.previous_edition = previous_edition;
		this.price = price;
	}

	// Default Constructor
	public Book() {

	}

	// Convert Book object to String
	@Override
	public String toString() {
		return "Book [ISBN=" + ISBN + ", year=" + year + ", published_by=" + published_by + ", previous_edition="
				+ previous_edition + ", price=" + price + "]";
	}

	// Getters and Setters for Private Data Members
	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String ISBN) {
		this.ISBN = ISBN;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getPublished_By() {
		return published_by;
	}

	public void setPublished_By(String publishedBy) {
		this.published_by = publishedBy;
	}

	public String getPrevious_Edition() {
		return previous_edition;
	}

	public void setPrevious_Edition(String previousEdition) {
		this.previous_edition = previousEdition;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

}
