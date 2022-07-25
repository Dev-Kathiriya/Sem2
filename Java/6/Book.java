class Book{
	private String author_name="---Dk--- Auther name";
	void display_book(){
		System.out.println("Auther is" + author_name);
	}
}
class Book_Publication extends Book{
	private String title="Book Publication";
	void display_book_publication(){
		System.out.println("Book Publication is" + title);
	}
}
class Paper_Publication extends Book{
	private String title="Paper Publication";
	void display_paper_publication(){
		System.out.println("Paper Publication is" + titlw);
	}
}
