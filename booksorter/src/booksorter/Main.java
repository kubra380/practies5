package booksorter;

import java.util.Iterator;
import java.util.TreeSet;



public class Main {

	public static void main(String[] args) {
		
		TreeSet<Book> book=new TreeSet<>();
		
		
        book.add(new Book("Suç ve Ceza", 5683, "Dotoyevski", "01.10.1980"));
        book.add(new Book("Vadideki Zambak", 3524, "Balzac", "01.10.1965"));
        book.add(new Book("Savaş ve Barış", 113, "Tolstoy", "15.05.1988"));
        book.add(new Book("Sefiller", 13245, "Victor HUgo", "25.09.1875"));
        book.add(new Book("Don Kişot", 202, "Cervantes", "02.11.1987"));
        
        Iterator<Book> value=book.iterator();
        while(value.hasNext()) {
        	Book b=(Book)value.next();
        	System.out.println(b.getBookName());
        }
        
	}

}
