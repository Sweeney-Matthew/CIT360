
package pkg360.practice;

// Make sure the class is serializable
public class Book implements java.io.Serializable{
    
    //instance variables
    private int pages;
    private boolean firstEd;
    private String title;
    private String author;
    
    // Setter functions
    public void setPages(int newPages) { this.pages = newPages; }
    public void setFirstEd(boolean newEd) { this.firstEd = newEd; }
    public void setTitle(String newTitle) { this.title = newTitle; }
    public void setAuthor(String newAuthor) { this.author = newAuthor; }
    
    // Getter functions
    public int getPages() { return pages; }
    public boolean getFirstEd() { return firstEd; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    
    // No argument default constructor
    public Book()
    {
    }
    
    
}