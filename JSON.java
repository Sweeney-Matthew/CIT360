package pkg360.practice;

import org.json.simple.JSONObject;
import java.util.*;

public class Practice{
        
public static void main(String args[]){ 

    // Encode 3 JSON objects
    JSONObject book1 = new JSONObject();    
    book1.put("title", "A Farewell to Arms");    
    book1.put("author", "Ernest Hemingway");    
    book1.put("edition", new Integer(2));    
    
    JSONObject book2 = new JSONObject();
    book2.put("title", "The Double");    
    book2.put("author", "Fyodor Dostoyevsky");    
    book2.put("edition", new Integer(6));    
    
    JSONObject book3 = new JSONObject();
    book3.put("title", "The Remains of the Day");    
    book3.put("author", "Kazuo Ishiguro");    
    book3.put("edition", new Integer(1));    
    
    ArrayList<JSONObject> list = new ArrayList<JSONObject>();
    
    list.add(book1); //Add JSON objects to list  
    list.add(book2);  
    list.add(book3);
    
    //Decode for each JSON object in the list
    for (JSONObject bookList:list){
        String title = (String) bookList.get("title");  
        String author = (String) bookList.get("author");  
        int edition = (int) bookList.get("edition");  
        System.out.println("\n" + title + " by " + author + " available in edition " + edition);
  }  
}
}