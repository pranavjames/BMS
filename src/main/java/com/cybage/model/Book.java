
package com.cybage.model;

public class Book {
    private int id;
    private String name;
    private int price;

    public Book() {
        // Default constructor required by Jackson
    }

    public Book(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // Getters and setters for the properties
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}














//package com.cybage.model;
//
//public class Book {
//	private int id;
//	private String title;
//	private String author;
//	private String publisher;
//	public Book() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//	public Book(int id, String title, String author, String publisher) {
//		super();
//		this.id = id;
//		this.title = title;
//		this.author = author;
//		this.publisher = publisher;
//	}
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	public String getTitle() {
//		return title;
//	}
//	public void setTitle(String title) {
//		this.title = title;
//	}
//	public String getAuthor() {
//		return author;
//	}
//	public void setAuthor(String author) {
//		this.author = author;
//	}
//	public String getPublisher() {
//		return publisher;
//	}
//	public void setPublisher(String publisher) {
//		this.publisher = publisher;
//	}
//	@Override
//	public String toString() {
//		return "Book [id=" + id + ", title=" + title + ", author=" + author + ", publisher=" + publisher + "]";
//	}
//	
//	
//
//}
