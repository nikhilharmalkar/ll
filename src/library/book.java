package library;

public class book {

	String title;
	
	public book(String author,String title,int price,int pages) {
		// TODO Auto-generated constructor stub
		this.title=title;
		this.author=author;
		this.price=price;
		this.pages=pages;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	 String author;
	int price;
	int pages;
	Author Author;
	
	 
}
