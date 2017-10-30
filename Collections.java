package pkg360.practice;

import java.util.*; 

class Collections{  
 public static void main(String args[]){  
  
 // **************
 // List example
 // **************
 
  ArrayList<Book> list = new ArrayList<Book>(); //Creating arraylist of objects 
  
  // Creating objects
  Book title1 = new Book("Ernest Hemingway", "A Farewell to Arms");
  Book title2 = new Book("Fyodor Dostoyevsky", "The Double");
  Book title3 = new Book("Fyodor Dostoyevsky", "The Double"); // List can include duplicates
  Book title4 = new Book("Kazuo Ishiguro", "The Remains of the Day");
  
  list.add(title1); //Add objects to list  
  list.add(title2);  
  list.add(title3);  
  list.add(title4);
  
  // Display list items
  System.out.println("List example\n");
  for (Book bookList:list){
		System.out.println(bookList.getTitle() + ", " + bookList.getAuthor());
  }
  
  // Clear list
  System.out.println("Before clear, size is: " + list.size());
  list.clear(); // Empties list of items, but the list as a data structure still is in memory
  System.out.println("After clear, size is: " + list.size());
  
  
 // **************
 // Set example
 // **************
  
  HashSet<String> set = new HashSet<String>();   
    
  // Adding Books to set  
  set.add("Ernest Hemingway");  
  set.add("James Joyce");  
  set.add("Ernest Hemingway"); // This adds a duplicate. In sets that isn't allowed
  set.add("John Updike");
  set.add("James Joyce"); // Ditto. Won't add duplicates.
  set.add("James Joyce");
  
  System.out.println("\nSet example\n");
  // Display set items 
  for(String bookSet:set){  
		System.out.println(bookSet);  
    }
  
  // Clear set
  System.out.println("Before clear, size is: " + set.size());
  set.clear(); // Empties list of items, but the list as a data structure still is in memory
  System.out.println("After clear, size is: " + set.size());
  
  
 // **************
 // Map example
 // **************
  
  // Creates map
  Map<Integer,Book> map = new HashMap<Integer,Book>();  
  
  System.out.println("\nMap example\n");
   
  // Add titles mapped to key values.
  map.put(3,title1);  
  map.put(200,title2); // The values are just a key.
  map.put(1,title4);
  
  // Displays the entries in key order.
  System.out.println("Before remove");
  for(Map.Entry<Integer,Book> m:map.entrySet()){
		int key = m.getKey();
		Book b = m.getValue();
		System.out.println(key + " " + b.getTitle() + " " + b.getAuthor());  
  }
  
  map.remove(200); // It's easy to remove things from a map. This removes the entry at key 200
  
  System.out.println("After remove");
  for(Map.Entry<Integer,Book> m:map.entrySet()){
		int key = m.getKey();
		Book b = m.getValue();
		System.out.println(key + " " + b.getTitle() + " " + b.getAuthor());  
  }
  
 // **************
 // Queue example
 // **************
  
  Queue<Book> queue = new LinkedList(); //create queue
  
 System.out.println("\nQueue example\n");
    
  // Add items to queue.
  queue.add(title1);
  queue.add(title2);
  queue.add(title3);
  queue.add(title4);
  
  for(Book q : queue) {
		System.out.println(q.getTitle() + ", " + q.getAuthor());
  }
  
  queue.remove(); // First in, first out. The item at the head is removed.
  System.out.println("First item removed.");
  
  // Print new head of queue
  Book first = queue.peek();
  System.out.println(first.getTitle() + ", " + first.getAuthor());
  
   
 // **************
 // Tree example
 // **************
 
    Map<Integer,Book> tm = new TreeMap();
    System.out.println("\nTree example\n");
    
    tm.putAll(map); // Use the map earlier and copy to this map
    
    System.out.println("Before anything");
    
    for(Map.Entry<Integer, Book> entry:map.entrySet()){    
        int key = entry.getKey();
        Book b = entry.getValue();
        System.out.println(key + " " + b.getTitle() + " " + b.getAuthor());   
    }
    
    // Adds something for key 2. The tree insures it will be stored in ascending order.
    tm.put(2, title2);
    tm.put(4, title4);
    
    int size = tm.size();
    System.out.println("New size is " + size);
    }
 }