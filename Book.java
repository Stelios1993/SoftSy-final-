public class Book {
<<<<<<< HEAD
//new
//neo
=======
//new book
>>>>>>> cff7cfd2e8e6e3375b70e099dcd167f6165bc897
	static Book books[]=new Book [10];
	private String bookname;
	private int numberOfpages;
	private Author author;

	static int counter=0;

		public Book(String bookname,int numberOfpages,Author author) {
			this.bookname=bookname;
			this.numberOfpages=numberOfpages;
			this.author=author;
			books[counter]=this;
			counter++;
				}

				public String getBookname() {
					return bookname;
				}
				public void setBookname(String bookname) {
					this.bookname=bookname;
				}
				public int getNumberOfpages() {
					return numberOfpages;
				}
				public void setNumberOfpages(int numberOfpages) {
					this.numberOfpages=numberOfpages;
				}
				public Author getAuthor() {
					return author;
				}
				public void setAuthor(Author author) {
					this.author=author;
				}
				public String toString() {
					return  bookname + ","+ "with number of pages " + numberOfpages + ", written by " + getAuthor();
				}

			}