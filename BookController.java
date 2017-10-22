package pkg360.practice;

import java.util.Scanner;

/**
 *
 * @author Matthew
 */
public class BookController {
   private Book model;
   private BookView view;

   // Model and view for controller
   public BookController(Book model, BookView view){
      this.model = model;
      this.view = view;
   }

   public void setBookName(String title){
      model.setTitle(title);		
   }

   public String getBookName(){
      return model.getTitle();		
   }

   public void setBookAuthor(String author){
      model.setAuthor(author);		
   }

   public String getBookAuthor(){
      return model.getAuthor();		
   }

   // sends info to views
   public void updateView(){				
      view.printBookDetails(model.getTitle(), model.getAuthor());
   }
   
   public void defaultView(){				
      view.printDefault();
   }
   
   // Collects input from user
   public void promptNewBook(){
      
      view.askForTitle();
      Scanner bookTitle = new Scanner(System.in);
      String title = bookTitle.nextLine();
      model.setTitle(title);
      
      view.askForAuthor();
      Scanner bookAuthor = new Scanner(System.in);
      String author = bookAuthor.nextLine();
      model.setAuthor(author);
   }

}
