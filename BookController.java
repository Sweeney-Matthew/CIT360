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
public class BookController {

   private Handler handler;
   boolean isLogged;

   public BookController(){
      handler = new Handler();
      isLogged = true;
   }
   
   public void handleRequest(int handle) {

      //Check if logged in
      if (isLogged == true) {
          handler.handleIt(handle);
      }
      else {
         System.out.println("You are not logged in."); 
      }
    }

}