package week1.day2;

public class Library {

	String addBook(String bookTitle) {
		return bookTitle;
		
	}
		void issueBook()
		{
		System.out.println(" Book issued successfully");
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library L=new Library();
		String book = L.addBook("Physics");
        System.out.println(book);
        L.issueBook();
	}

}
