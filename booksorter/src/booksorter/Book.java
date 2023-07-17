package booksorter;

import java.util.TreeSet;

public class Book implements Comparable<Book> {
private String bookName;
private int numberPage;
private String writerName;
private String publishDate;

@Override
public int compareTo(Book o) {
	
	return this.getBookName().compareTo(o.getBookName());
}


public Book(String bookName, int numberPage, String writerName, String publishDate) {

	this.bookName = bookName;
	this.numberPage = numberPage;
	this.writerName = writerName;
	this.publishDate = publishDate;
}


public String getBookName() {
	return bookName;
}

public void setBookName(String bookName) {
	this.bookName = bookName;
}

public int getNumberPage() {
	return numberPage;
}

public void setNumberPage(int numberPage) {
	this.numberPage = numberPage;
}

public String getWriterName() {
	return writerName;
}

public void setWriterName(String writerName) {
	this.writerName = writerName;
}

public String getPublishDate() {
	return publishDate;
}

public void setPublishDate(String publishDate) {
	this.publishDate = publishDate;
}



}
