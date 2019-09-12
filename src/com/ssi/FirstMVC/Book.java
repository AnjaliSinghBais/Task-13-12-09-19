package com.ssi.FirstMVC;

public class Book {
	private int id;
	private String b_name;
	private String b_subject;
	private int b_price;
	private String b_author;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getB_name() {
		return b_name;
	}

	public void setB_name(String b_name) {
		this.b_name = b_name;
	}

	public String getB_subject() {
		return b_subject;
	}

	public void setB_subject(String b_subject) {
		this.b_subject = b_subject;
	}

	public int getB_price() {
		return b_price;
	}

	public void setB_price(int b_price) {
		this.b_price = b_price;
	}

	public String getB_author() {
		return b_author;
	}

	public void setB_author(String b_author) {
		this.b_author = b_author;
	}

	public Book(int id, String b_name, String b_subject, int b_price, String b_author) {
		super();
		this.id = id;
		this.b_name = b_name;
		this.b_subject = b_subject;
		this.b_price = b_price;
		this.b_author = b_author;
	}

	public Book() {
		super();
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", b_name=" + b_name + ", b_subject=" + b_subject + ", b_price=" + b_price
				+ ", b_author=" + b_author + "]";
	}

}
