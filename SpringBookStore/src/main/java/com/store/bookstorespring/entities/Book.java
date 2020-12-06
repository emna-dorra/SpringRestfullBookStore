package com.store.bookstorespring.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "books")
public class Book implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;
	@Column
	public String title;
	@Column
	public String author;
	@Column
	public double price;
	@Column
	public Date releaseDate;

	public Book(Book b) {
		this.id = b.id;
		this.title = b.title;
		this.author = b.author;
		this.price = b.price;
		this.releaseDate = b.releaseDate;

	}

	public Book(Long id, String title, String author, double price, Date releaseDate) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.price = price;
		this.releaseDate = releaseDate;
	}

	public Book() {

	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setRelease(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + ", price=" + price + ", releaseDate="
				+ releaseDate + "]";
	}
}
