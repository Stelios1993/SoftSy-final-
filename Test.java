//This is the final project
import java.util.Scanner;
//new
public class Test {
    public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);


		Author Oscar = new Author ("Oscar Wilde",20,"theater" );
        Author Fyodor  = new Author ("Fyodor Dostoyevsky",35,"literature");
        Author William = new Author ("William Shakespeare",12,"poem");
        Author Charles = new Author ("Charles Dickens",69,"fairytale");
    	Author Joanne = new Author ("Joanne K Rowlling",15,"science fiction");

    	new Book ("The Picture of Dorian Gray", 695 , Oscar );
    	new Book ("Salome", 986 , Oscar);
    	new Book ("The Idiot",889,Fyodor );
    	new Book ("Demons",678,Fyodor);
    	new Book ("Karamazov Brothers",1052,Fyodor );
    	new Book ("Hamlet",1502,William);
    	new Book ("Romeo and Juliet",892,William);
    	new Book ("Oliver Twist",200,Charles );
    	new Book ("Christmas Story",456,Charles);
    	new Book ("Harry Poter and the chamber of secrets",358,Joanne );

    	navin:


 		 while (true){
		  System.out.println("\n**********   Books of famous authors    **********\n");
 			 System.out.println("Menu:");
 				 System.out.println("Type 1 to display books' list");
 					 System.out.println("Type 2 to search books by author's name");
						  System.out.println("Type 3 to create a new author");
 							 System.out.println("Type 4 to display the book with the most pages");
								  System.out.println("Type 5 to change book pages");
									 System.out.println( "\nType here:\n");


  			int choice = scanner.nextInt();

    		if (choice == 1){

     		 System.out.println("\n              ......List of Books:......\n");
     		  int b=0;
      			for (Book book: Book.books){
				  if (book!=null)
				  b++;
				     System.out.println();
          			 System.out.println(b+")"+ " " + book);
    					  }
  							  }


		    if (choice == 2){

				System.out.println("Give the name of an author");
					System.out.print("Type here: ");
						scanner.nextLine();
							String aname=scanner.nextLine();
								System.out.println("");

									int counter=0;
                                     int bk=0;
							for (int i=0; i<Book.books.length; i++ ) {
								if(Book.books[i] != null){
									if (Book.books[i].getAuthor().getName().contains(aname)){
										bk++;
										System.out.println( bk+") " +Book.books[i].getBookname());
											counter++;
									}
								}
							}
								System.out.println("\n ......Number of books that were found:...... "+counter);
		}




            if (choice==3){
			  System.out.println("      *****  Create a new Author:  *****");
			 	 System.out.println("Insert the name of a new author:");
			 		scanner.nextLine();
					  String name = scanner.nextLine();
					  	System.out.println(" Insert the number of author's published books: ");
					  	  int publishedbooks=scanner.nextInt();

					  while (publishedbooks<1) {
					    System.out.println("Type a positive integer for pages ");
						 publishedbooks=scanner.nextInt();
					  }
					  	System.out.println("What is the author's type of writing?");
					 	 String typeOfwriting=scanner.next();

					 	 new Author (name,publishedbooks,typeOfwriting);

					  	System.out.println(" A new author has been created:");
					  	System.out.println("The name of the new author is " +name + ", with " +publishedbooks +" published books " + "and his/her type of writting is " + typeOfwriting);
				}

            if (choice==4) {
        	  System.out.println("***  The book with the most pages  ***");
        	  	int max=0;
             	 String namemax="";
        	  for(int j=0; j<Book.books.length; j++) {
        		  if(Book.books[j].getNumberOfpages()>max) {
        			  max=Book.books[j].getNumberOfpages();
        			  namemax = Book.books[j].getBookname();
        			  }
        		  }

        			  System.out.println( namemax+"," + "is the book with the most pages: " +max);
        		  }

		   if (choice==5) {
			  System.out.println(" Give a number between 0-9: ");
			 	 int num=scanner.nextInt();
				  while(num<0 || num>9) {
					  System.out.println("Your number is out of the range, try again:");
			  			 num=scanner.nextInt();
				  }
					  System.out.println("Give a new number of pages:");
		  				int numOfpages=scanner.nextInt();
		  					if(numOfpages>0) {
		  						Book.books[num].setNumberOfpages(numOfpages);
		  							System.out.println("The pages of the book " + "<<" +Book.books[num].getBookname()+">> has changed to "+ Book.books[num].getNumberOfpages());
		  								}
		  					else  {

		  							continue navin;

		  			}
		  		}
		  }
    }
}


