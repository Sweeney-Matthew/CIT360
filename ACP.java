package pkg360.practice;

public class ACP{
        
        public static void main(String[] args) {

        BookController con = new BookController();
        
        con.handleRequest(3);
        con.handleRequest(1);
        con.handleRequest(2);
    }
           
}