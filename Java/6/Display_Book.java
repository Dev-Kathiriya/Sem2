class Display_Book{
	public static void main(String[] args) {
		Book ref;
		ref =new Book();
		System.out.println("Class called is Book");
		ref.display_book();
		System.out.println("Class called is Book_Publication");
		ref =new Book_Publication();
		ref.display_book_publication();
		System.out.println("Class called is Paper_Publication");
		ref = new Paper_Publication();
		ref.display_paper_publication();
	}
}