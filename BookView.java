package pkg360.practice;


/**
 *
 * @author Matthew
 */
public class BookView {
    
	// Default view
    public void printDefault(){
      System.out.println("********************************\n" +
                         "Welcome to book database\n" +
                         "********************************");
    }
    
	// Asks for title
    public void askForTitle(){
      System.out.println("Please enter title:");
    }
    
	// Asks for author
    public void askForAuthor(){
      System.out.println("Please enter author:");
    }
    
	// Displays book info
    public void printBookDetails(String bookTitle, String bookAuthor){
      System.out.println("Book: ");
      System.out.println("Title: " + bookTitle);
      System.out.println("Author: " + bookAuthor);
   }
}
