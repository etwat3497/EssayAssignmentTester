/*
 * Created by Ethan Watt
 * On November 4, 2016
 * Designed to demonstrate superclass and subclasses and determine essay characteristics
 */

package essayassignmenttester;

import java.util.Scanner;

/**
 *
 * @author etwat3497
 */
public class EssayAssignmentTester {

   /**
    * pre: String array
    * post: void
    * Main method to have the account tester communicate with the account class and it's subclasses
    */
    public static void main(String[] args) {
        // TODO code application logic here
        //Create new scanner 
        Scanner input = new Scanner(System.in);
        
        //Declare variables
        double words = 0, numOfPages = 0;
        Boolean essaySize = false;
        
        //Create new document object and polymorphize it as the essay subclass
        Document obj;
        obj = new Essay();
        
        //Get user input
        System.out.println("How many words is your essay?");
        words = Integer.parseInt(input.nextLine());
        
        //Set the words in the essay
        obj.setWords(words);
        
        //Determine the essay size of the object
        essaySize = obj.validLength();
        
        //If the essay is a bad size run
        if(essaySize == false){
            System.out.println("Your essay is not between the minimum and maximum number of words!");
        }
        //If the essay is a good size run
        else if(essaySize == true){
            numOfPages = obj.calculatePages();
            System.out.println("The essay will have "+numOfPages+" pages.");
        }
    }
    
}
