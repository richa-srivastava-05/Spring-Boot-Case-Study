package com.librarysys;

import javax.persistence.Entity;
import javax.persistence.Id;

	@Entity
	public class Books  {
		private int book_id;
		private String book_name;
		private String author;
		private int count;
		
		@Id 
		public int getBook_id() {
			return book_id;
		}
		public void setBook_id(int book_id) {
			this.book_id = book_id;
		}
		public String getBook_name() {
			return book_name;
		}
		public void setBook_name(String book_name) {
			this.book_name = book_name;
		}
		public String getAuthor() {
			return author;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
		public int getCount() {
			return count;
		}
		public void setCount(int count) {
			this.count = count;
		}
		
		@Override
		public String toString() {
			return "Books [book_id=" + book_id + ", book_name=" + book_name + ", author=" + author + ", count=" + count
					+ "]";

		}
	}


