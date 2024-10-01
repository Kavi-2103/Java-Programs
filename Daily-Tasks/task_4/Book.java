package task_4;

public class Book {
	
	String title;
	String author;
	int price;
	
	public Book() {
		this.title="The Scarlet Letter";
		this.author="Nathaniel Hawthorne";
		this.price=1000;
	}
	public Book(String title,String author) {
		this.title=title;
		this.author=author;
	}
	public Book(String title,String author,int price) {
		this.title=title;
		this.author=author;
		this.price=price;
	}
	
	void printDetails() {
		System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1=new Book();
		Book b2=new Book("Robinson Crusoe","Daniel Defoe");
		Book b3=new Book("Wuthering Heights","Emily Bronte",2500);
		

		System.out.println("Book-1 Details: ");
		b1.printDetails();

		System.out.println("Book-2 Details: ");
		b2.printDetails();
		
		System.out.println("Book-3 Details: ");
		b3.printDetails();
	}

}
