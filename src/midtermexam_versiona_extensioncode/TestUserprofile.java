/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

import java.util.Scanner;

/**
 *
 * @author Darshan Jagani edited this file in github
 */
public class TestUserprofile {
    
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter your name: ");
    String name = scanner.nextLine();

    String[] genres = {"Comedy", "Drama", "Action", "Romance"};
    
    System.out.println("Pick your favorite genre (select number):");
    for(int i=0; i<genres.length; i++) {
      System.out.println((i+1) + ". " + genres[i]); 
    
}

 System.out.print("Your choice: ");
    int choice = scanner.nextInt();
    String genre = genres[choice-1];
    
    System.out.println("");
    System.out.println("Your user profile is successfully created!");
    System.out.println("");
    System.out.println("Name: " + name);
    System.out.println("Favorite genre: " + genre);
  }

}
