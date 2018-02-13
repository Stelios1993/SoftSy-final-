public class Author {
//new1
	static Author authors[]=new Author [10];
	private String name;
	private int publishedbooks;
	private String typeOfwriting;

	static int counter=0;

		public Author (String name,int publishedbooks,String typeOfwriting) {
			this.name=name;
			this.publishedbooks=publishedbooks;
			this.typeOfwriting=typeOfwriting;
			authors[counter]=this;
			counter++;
		}

				public String getName() {
					return name;
				}
				public void setName(String name) {
					this.name=name;
				}
				public int getPublishedbooks() {
					return publishedbooks;
				}
				public void setPublishedbooks(int publishedbooks) {
					this.publishedbooks=publishedbooks;
				}
				public String getTypeOfwriting() {
					return typeOfwriting;
				}
				public void setTypeOfwriting(String typeOfwriting) {
					this.typeOfwriting=typeOfwriting;
				}
				public String toString() {
					return  name + ","+ "who has published " + publishedbooks + " books," +"and his/her type of writing is: "+typeOfwriting;
				}

			}