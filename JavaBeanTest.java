package pkg360.practice;


public class Practice{
  public static void main(String[] args) {
      
      final Book book1 = new Book();
      
      book1.setPages(100);
      book1.setFirstEd(false);
      book1.setTitle("The Shining");
      book1.setAuthor("Stephen King");
      
      System.out.print(book1.getTitle());
      System.out.println(" by " + book1.getAuthor());

   }
  }