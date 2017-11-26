/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg360.practice;

/**
 *
 * @author Matthew
 */
public class OutView implements View{
    
    @Override
    public void display(){
        
      System.out.println("********************************\n" +
                         "Out of Stock\n" +
                         "********************************");
      
      System.out.println("The Sun Also Rises, Ernest Hemingway");
      System.out.println("The Sound and the Fury, William Faulkner");
      System.out.println("Finnegan's Wake, James Joyce");
      System.out.println("The Two Towers, J R R Tolkien");
      System.out.println("Ringworld, Larry Niven");
   }
}