package pkg360.practice;


import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.hibernate.Transaction;  
import org.hibernate.cfg.Configuration;  
  
public class StoreBook {  
   public static void main(String[] args) {  
      
    //creates configuration object  
    Configuration config = new Configuration(); 
    
    //pulls in configuration information into newly created configuration object 
    config.configure("Hibernate.cfg.xml"); 
      
    //creates sessionfactory object from configuration object 
    SessionFactory factory = config.buildSessionFactory();  
      
    //Opens a new Hibernate session
    Session session = factory.openSession();  
      
    //creates transaction within the session 
    Transaction tran = session.beginTransaction();  
    
    // Create a new book object to add to database      
    Book book1 = new Book();
    
    // set book information  
    book1.setPages(100);
    book1.setFirstEd(false);
    book1.setTitle("The Shining");
    book1.setAuthor("Stephen King");  
    
    // This saves the transaction until committed or changed  
    session.persist(book1);
    
    // Just displays a statement that the info was persisted 
    System.out.println("Book persisted");  
    
    // Commits the transaction to the database  
    tran.commit(); 
    
    // Closes the session
    session.close();  
      
      
}  
}  