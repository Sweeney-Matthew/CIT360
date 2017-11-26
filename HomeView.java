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
public class HomeView implements View{
    
    @Override
    public void display(){
    System.out.println("********************************\n" +
                         "Welcome to book database\n" +
                         "********************************");
    System.out.println("1 for Stocklist and 2 for Out of stock items.");
    }
    
}