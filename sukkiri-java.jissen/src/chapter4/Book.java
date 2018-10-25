package chapter4;

import java.util.Date;

public class Book implements Comparable<Book>,Cloneable{

	private String title;
	private Date publishDate;
	private String comment;
	public int hashCode() {
		int result = 1;
		result = result * 31 + title.hashCode();
		result = result * 31 + publishDate.hashCode();
		return result;
	}

	public boolean equals(Object o) {
		if(o == this) {
			return true;
		}
		if(o == null){
			return false;
		}
		if(!(o instanceof Book)) {
			return false;
		}
		Book book = (Book) o;
		if(!this.title.equals(book.title)){
			return false;
		}
		if(!this.publishDate.equals(book.publishDate)) {
			return false;
		}
		return true;
	}

	public int compareTo(Book b) {
		return this.publishDate.compareTo(b.publishDate);
	}

	public Book clone() {
		Book result = new Book();
		result.title = this.title;
		result.publishDate = (Date)this.publishDate.clone();
		result.comment = this.comment;
		return result;
	}




}
