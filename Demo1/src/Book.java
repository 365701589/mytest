
public class Book {
private String name;
private String author;
private String publisher;
public Book(String name, String author, String publisher) {
	super();
	this.name = name;
	this.author = author;
	this.publisher = publisher;
}

public Book() {
	super();
	
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public String getPublisher() {
	return publisher;
}
public void setPublisher(String publisher) {
	this.publisher = publisher;
}
	public String toString(){
		return ""+name+","+author+","+publisher+"";
	}

}
