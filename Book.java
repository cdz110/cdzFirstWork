package com.neuedu.library.domain;

public class Book {
	
	private Integer book_id;
	
	private String book_name;
	
	private Integer book_count;
	
	private Integer book_status;

	public Integer getBook_id() {
		return book_id;
	}

	public void setBook_id(Integer book_id) {
		this.book_id = book_id;
	}

	public String getBook_name() {
		return book_name;
	}

	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}

	public Integer getBook_count() {
		return book_count;
	}

	public void setBook_count(Integer book_count) {
		this.book_count = book_count;
	}

	

	

	@Override
	public String toString() {
		return "Book [book_id=" + book_id + ", book_name=" + book_name + ", book_count=" + book_count + ", book_status="
				+ book_status + "]\n";
	}

	public Book(Integer book_id, String book_name, Integer book_count, Integer book_status) {
		super();
		this.book_id = book_id;
		this.book_name = book_name;
		this.book_count = book_count;
		this.book_status = book_status;
	}

	public Integer getBook_status() {
		return book_status;
	}

	public void setBook_status(Integer book_status) {
		this.book_status = book_status;
	}

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
	
//	book_id int  primary key auto_increment,
//    book_name varchar(30) not null unique,
//    book_count int not null,
//    book_status int check(book_status in(1,0))

}
